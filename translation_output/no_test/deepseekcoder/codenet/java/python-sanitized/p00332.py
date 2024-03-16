import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = None
        self.pos = 0
        self.length = 0

    def has_next_byte(self):
        if self.pos < self.length:
            return True
        else:
            self.pos = 0
            self.length = self.inp.read(self.buf)
            if self.length <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buf[self.pos]
        return -1

    def is_printable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buf