import sys

class Reader:
    def __init__(self, inp):
        self.inp = inp
        self.buf = []
        self.bufidx = -1

    def readBuf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.inp.readline().split(" ")
            self.bufidx = 0

    def s(self):
        self.readBuf()
        return self.buf[self.bufidx]

    def i(self):
        return int(self.s())

    def l(self):
        return long(self.s())

    def d(self):
        return float(self.s())

    def sa(self):
        self.readBuf()
        if self.bufidx != 0:
            raise RuntimeError("illegal read")
        self.bufidx = -1
        return self.buf

    def ia(self):
        sa = self.sa()
        return [int(x) for x in sa]

    def la(self):
        sa = self.sa()
        return [long(x) for x in sa]

    def da(self):
        sa = self.sa()
        return [float(x) for x in sa]

    def im(self, N):
        im = [[0] * N for _ in range(N)]
        for i in range(N):
            im[i] = self.ia()
        return im

    def lm(self, N):
        lm = [[0] * N for _ in range(N)]
        for i in range(N):
            lm[i] = self.la()
        return lm

    def dm(self, N):
        dm = [[0] * N for _ in range(N)]
        for i in range(N):
            dm[i] = self.da()
        return dm


if __name__ == "__main__":
    reader = Reader(sys.stdin)
    N = reader.i()
    print((N - 1) // 2)