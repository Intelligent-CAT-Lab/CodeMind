import sys

class Reader:

    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = None
        self.idx = -1

    def close(self):
        self.inp.close()

    def read_buf(self):
        if self.idx == -1 or self.idx == len(self.buf):
            self.buf = self.inp.readline().split()
            self.idx = 0

    def s(self):
        self.read_buf()
        return self.buf[self.idx]

    def i(self):
        return int(self.s())

    def l(self):
        return long(self.s())

    def d(self):
        return float(self.s())

    def sa(self):
        self.read_buf()
        if self.idx != 0:
            raise RuntimeError("illegal read")
        self.idx = -1
        return self.buf

    def ia(self):
        return list(map(int, self.sa()))

    def la(self):
        return list(map(long, self.sa()))

    def da(self):
        return list(map(float, self.sa()))

    def im(self, N):
        return [self.ia() for _ in range(N)]

    def lm(self, N):
        return [self.la() for _ in range(N)]

    def dm(self, N):
        return [self.da() for _ in range(N)]


def main():
    with Reader() as r:
        N = r.i()
        print((N - 1) // 2)


if __name__ == "__main__":
    main()