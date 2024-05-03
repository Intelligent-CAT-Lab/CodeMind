import sys

class FastInput:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = None

    def read(self):
        while self.buf_offset == self.buf_len:
            self.buf_offset = 0
            try:
                self.buf_len = self.input_stream.readinto(self.buf)
            except IOError:
                self.buf_len = -1
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.next is not None and self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1

        self.skip_blank()
        if self.next == ord('+') or self.next == ord('-'):
            sign = 1 if self.next == ord('+') else -1
            self.next = self.read()

        val = 0
        if sign == 1:
            while self.next >= ord('0') and self.next <= ord('9'):
                val = val * 10 + self.next - ord('0')
                self.next = self.read()
        else:
            while self.next >= ord('0') and self.next <= ord('9'):
                val = val * 10 - self.next + ord('0')
                self.next = self.read()

        return val

class FastOutput:
    def __init__(self, output_stream):
        self.output_stream = output_stream
        self.cache = bytearray(10 << 20)
        self.cache_offset = 0

    def write(self, c):
        self.cache[self.cache_offset] = c
        self.cache_offset += 1

    def println