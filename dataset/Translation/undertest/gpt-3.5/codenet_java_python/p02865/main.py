import sys

class Reader:
    def __init__(self, file):
        self.file = file
        self.buf = []
        self.bufidx = -1

    def read_buf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.file.readline().split()
            self.bufidx = 0

    def s(self):
        self.read_buf()
        return self.buf[self.bufidx]

    def i(self):
        return int(self.s())

    def l(self):
        return int(self.s())

    def d(self):
        return float(self.s())

with sys.stdin as file:
    r = Reader(file)
    N = r.i()
    print((N - 1) // 2)