class FastInput:
    def __init__(self, is):
        self.is = is
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next_char = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            try:
                self.buf_len = self.is.readinto(self.buf)
            except IOError as e:
                raise RuntimeError(e)
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while 0 <= self.next_char <= 32:
            self.next_char = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.next_char == ord('+') or self.next_char == ord('-'):
            sign = 1 if self.next_char == ord('+') else -1
            self.next_char = self.read()
        val = 0
        if sign == 1:
            while ord('0') <= self.next_char <= ord('9'):
                val = val * 10 + self.next_char - ord('0')
                self.next_char = self.read()
        else:
            while ord('0') <= self.next_char <= ord('9'):
                val = val * 10 - self.next_char + ord('0')
                self.next_char = self.read()
        return val


class FastOutput:
    def __init__(self, os):
        self.cache = bytearray()
        self.os = os

    def println(self, c):
        self.cache.extend(str(c).encode())
        self.cache.append(ord('\n'))
        return self

    def flush(self):
        try:
            self.os.write(self.cache)
            self.cache = bytearray()
        except IOError as e:
            raise RuntimeError(e)

    def close(self):
        self.flush()
        try:
            self.os.close()
        except IOError as e:
            raise RuntimeError(e)


class TaskC:
    def __init__(self):
        self.f = []
        self.suffix = []
        self.n = 0
        self.mod = Number