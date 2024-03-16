import sys

class Reader:

    def __init__(self, inp):
        self.br = inp
        self.buf = []
        self.bufidx = -1

    def close(self):
        self.br.close()

    def read_buf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            line = self.br.readline().rstrip()
            self.buf = line.split()
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

    def sa(self):
        self.read_buf()
        if self.bufidx != 0:
            raise RuntimeError("illegal read")
        self.bufidx = -1
        return self.buf

    def ia(self):
        sa = self.sa()
        return [int(x) for x in sa]

    def la(self):
        sa = self.sa()
        return [int(x) for x in sa]

    def da(self):
        sa = self.sa()
        return [float(x) for x in sa]

    def im(self, N):
        im = []
        for _ in range(N):
            im.append(self.ia())
        return im

    def lm(self, N):
        lm = []
        for _ in range(N):
            lm.append(self.la())
        return lm

    def dm(self, N):
        dm = []
        for _ in range(N):
            dm.append(self.da())
        return dm

if __name__ == "__main__":
    r = Reader(sys.stdin)
    N = r.i()
    print((N - 1) // 2)