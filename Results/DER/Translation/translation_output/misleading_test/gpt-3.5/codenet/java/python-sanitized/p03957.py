import sys


class FastInput:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.default_string_buf = []
        self.buf = [0] * (1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf_len = self.input_stream.readinto(self.buf)
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while 0 <= self.next <= 32:
            self.next = self.read()

    def read_string(self, builder):
        self.skip_blank()
        while self.next > 32:
            builder.append(chr(self.next))
            self.next = self.read()
        return builder


class FastOutput:
    def __init__(self, output_stream):
        self.output_stream = output_stream
        self.cache = []
        self.os = output_stream.buffer

    def println(self, c):
        self.cache.append(c + '\n')
        return self

    def flush(self):
        try:
            self.os.write(''.join(self.cache).encode())
            self.os.flush()
        except Exception as e:
            raise e

    def close(self):
        self.flush()
        

def solve():
    input_stream = sys.stdin.buffer
    output_stream = sys.stdout.buffer
    in_stream = FastInput(input_stream)
    out_stream = FastOutput(output_stream)

    s = in_stream.read_string([])
    c_index = s.find(b'C')
    f_index = s.rfind(b'F')
    if c_index < 0 or f_index < 0 or f_index < c_index:
        out_stream.println("No")
    else:
        out_stream.println("Yes")
    
    out_stream.flush()


if __name__ == "__main__":
    solve()