import sys

class FastInput:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            try:
                self.buf_len = self.input_stream.readinto(self.buf)
            except IOError as e:
                raise RuntimeError(e)
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset++]

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_string(self, builder):
        self.skip_blank()

        while self.next > 32:
            builder.append(chr(self.next))
            self.next = self.read()

        return builder.toString()

    def read_string(self):
        self.default_string_buf.setLength(0)
        return self.read_string(self.default_string_buf)

class FastOutput:
    def __init__(self, output_stream):
        self.output_stream = output_stream
        self.cache = bytearray(1 << 20)

    def println(self, c):
        self.cache.append(c.encode('utf-8')).append(b'\n')
        return self

    def flush(self):
        try:
            self.output_stream.write(self.cache)
            self.cache.setLength(0)
        except IOError as e:
            raise UncheckedIOException(e)
        return self

    def close(self):
        self.flush()
        try:
            self.output_stream.close()
        except IOError as e:
            raise UncheckedIOException(e)

class TaskA:
    def solve(self, test_number, in, out):
        s = in.read_string()
        c_index = s.find('C')
        f_index = s.rfind('F')
        if c_index < 0 or f_index < 0 or f_index < c_index:
            out.println("No")
        else:
            out.println("Yes")

class TaskAdapter(Runnable):
    def run(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        in = FastInput(input_stream)
        out = FastOutput(output_stream)
        solver = TaskA()
        solver.solve(1, in, out)
        out.close()

if __name__ == '__main__':
    thread = Thread(None, TaskAdapter(), "daltao", 1 << 27)
    thread.start()
    thread.join()