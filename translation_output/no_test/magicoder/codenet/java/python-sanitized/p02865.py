import sys

class Reader:
    def __init__(self, inp):
        self.inp = inp
        self.buf = None
        self.bufidx = -1

    def close(self):
        self.inp.close()

    def read_buf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.inp.readline().split()
            self.bufidx = 0

    def s(self):
        self.read_buf()
        return self.buf[self.bufidx]

    def i(self):
        return int(self.s())

    def l(self):
        return long(self.s())

    def d(self):
        return float(self.s())

    def sa(self):
        self.read_buf()
        if self.bufidx != 0:
            raise RuntimeError("illegal read")
        self.bufidx = -1
        return self.buf

    def ia(self):
        return [int(x) for x in self.sa()]

    def la(self):
        return [long(x) for x in self.sa()]

    def da(self):
        return [float(x) for x in self.sa()]

    def im(self, N):
        return [self.ia() for _ in range(N)]

    def lm(self, N):
        return [self.la() for _ in range(N)]

    def dm(self, N):
        return [self.da() for _ in range(N)]


def main():
    with Reader(sys.stdin) as r:
        N = r.i()
        print((N - 1) // 2)


if __name__ == "__main__":
    main()