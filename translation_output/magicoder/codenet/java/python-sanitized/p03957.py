import sys
import threading

class FastInput:
    def __init__(self, is_):
        self.is_ = is_
        self.buf = bytearray(1 << 13)
        self.buf_offset = 0
        self.buf_len = 0

    def read(self):
        while self.buf_offset == self.buf_len:
            self.buf_offset = 0
            self.buf_len = self.is_.readinto(self.buf)
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.read() <= 32:
            pass

    def read_string(self, builder):
        self.skip_blank()
        while True:
            c = self.read()
            if c > 32:
                builder.append(chr(c))
            else:
                break
        return builder

    def read_string(self):
        builder = []
        return self.read_string(builder)

class FastOutput:
    def __init__(self, os):
        self.os = os
        self.cache = []

    def println(self, c):
        self.cache.append(c)
        self.cache.append('\n')

    def flush(self):
        self.os.write(''.join(self.cache))
        self.cache = []

    def close(self):
        self.flush()
        self.os.close()

class TaskA:
    def solve(self, test_number, in_, out):
        s = in_.read_string()
        c_index = s.find('C')
        f_index = s.rfind('F')
        if c_index < 0 or f_index < 0 or f_index < c_index:
            out.println("No")
        else:
            out.println("Yes")

class TaskAdapter(threading.Thread):
    def run(self):
        in_ = FastInput(sys.stdin)
        out = FastOutput(sys.stdout)
        solver = TaskA()
        solver.solve(1, in_, out)
        out.close()

if __name__ == '__main__':
    thread = TaskAdapter()
    thread.start()
    thread.join()