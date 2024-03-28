import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buffer = bytearray(sys.stdin.read(1024))
        self.l = 0
        self.r = 0

    def read(self):
        if self.l == self.r:
            self.l = 0
            self.r = self.inp.readinto(self.buffer)
        return self.buffer[self.l] if self.l < self.r else -1

    def read_int(self):
        while True:
            b = self.read()
            if b == -1:
                return -1
            if 33 <= b <= 126:
                break
        n = b - 48
        while True:
            b = self.read()
            if b == -1 or not 48 <= b <= 57:
                return n
            n = n * 10 + b - 48

    def read_long(self):