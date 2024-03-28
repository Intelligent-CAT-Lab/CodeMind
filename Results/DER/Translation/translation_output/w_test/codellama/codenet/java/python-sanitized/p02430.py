import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.length = 0
        self.p = 0

    def has_next_byte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.stream.readinto(self.buffer)
            except Exception as e:
                e.printStackTrace()
            if self.length <= 0:
                return False

    def read_byte(self):
        if self.has_next_byte() == True:
            return self.buffer[self.p++]
        return -1

    def is_printable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.p]):
            self.p += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = StringBuilder()
        t = self.read_byte()
        while self.is_printable(t):
            sb.append_codepoint(t)
            t = self.read_byte()
        return sb.toString()

    def next_array(self, n):
        ar = [None] * n
        for i in range(n):
            ar[i] = self.next()
        return ar

    def next_int(self):
        return int(self.next_long