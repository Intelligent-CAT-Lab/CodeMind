import sys

class FastInput:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.buf_len = 0
        self.buf_offset = 0
        self.CACHE_SIZE = 1 << 13
        self.next = 0

    def read(self):
        while self.buf_offset >= self.buf_len:
            self.buf_offset = 0
            self.buf = self.stream.read(self.CACHE_SIZE)
            if not self.buf:
                return -1
            self.buf_len = len(self.buf)
        result = self.buf[self.buf_offset]
        self.buf_offset += 1
        return result

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.next == 43 or self.next == 45:
            sign = 1 if self.next == 43 else -1
            self.next = self.read()
        val = 0
        if sign == 1:
            while 48 <= self.next <= 57:
                val = val * 10 + self.next - 48
                self.next = self.read()
        else:
            while 48 <= self.next <= 57:
                val = val * 10 - self.next + 48
                self.next = self.read()
        return val

class Number