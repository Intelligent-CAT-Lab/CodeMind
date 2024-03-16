import sys

class FastInput:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            try:
                self.buf_len = self.stream.readinto(self.buf)
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
    def __init__(self, stream):
        self.stream = stream
        self.cache = bytearray(1 << 20)

    def println(self, c):
        self.cache.append(c.encode("utf-8")).append(b"\n")
        return self

    def flush(self):
        try:
            self.stream.write(self.cache)
            self.cache.setLength(0)
        except IOError as e:
            raise UncheckedIOException(e)
        return self

    def close(self):
        self.flush()
        try:
            self.stream.close()
        except IOError as e:
            raise UncheckedIOException(e)

class TaskA:
    def solve(self, test_number, in, out):
        s = in.read_string()
        c_index = s.find("C")
        f_index = s.rfind("F")
        if c_index < 0 or f_index < 0 or f_index < c_index:
            out.println("No")
        else:
            out.println("Yes")

if __name__ == "__main__":
    thread = Thread(None, TaskA(), "daltao", 1 << 27)
    thread.start()
    thread.join()



Please note that this is just a rough implementation, and you may need to modify it to fit your specific needs.</s>