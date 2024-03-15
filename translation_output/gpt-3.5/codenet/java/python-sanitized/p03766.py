import sys

class FastInput:
    def __init__(self, input_stream):
        self.is_ = input_stream
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next_byte = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf_len = self.is_.readinto(self.buf)
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.next_byte >= 0 and self.next_byte <= 32:
            self.next_byte = self.read()

    def read_int(self):
        sign = 1

        self.skip_blank()
        if self.next_byte == 43 or self.next_byte == 45:
            sign = 1 if self.next_byte == 43 else -1
            self.next_byte = self.read()

        val = 0
        if sign == 1:
            while 48 <= self.next_byte <= 57:
                val = val * 10 + self.next_byte - 48
                self.next_byte = self.read()
        else:
            while 48 <= self.next_byte <= 57:
                val = val * 10 - self.next_byte + 48
                self.next_byte = self.read()

        return val

class FastOutput:
    def __init__(self, output_stream):
        self.cache = bytearray(10 << 20)
        self.os = output_stream

    def println(self, c):
        self.cache.extend(str(c).encode('utf-8') + b'\n')

    def flush(self):
        try:
            self.os.write(self.cache)
            self.os.flush()
            self.cache = bytearray(10 << 20)
        except IOError as e:
            raise e

    def close(self):
        self.flush()
        try:
            self.os.close()
        except IOError as e:
            raise e

class Number