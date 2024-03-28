import sys

class Reader:
    def __init__(self, stream):
        self.buf = stream
        self.bufidx = -1

    def close(self):
        self.buf.close()

    def readBuf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.buf.readline().split(" ")
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
        if self.bufidx!= 0:
            raise Exception("illegal read")
        self.bufidx = -1
        return self.buf

    def ia(self):
        sa = self.sa()
        ia = []
        for i in sa:
            ia.append(int(i))
        return ia

    def la(self):
        sa = self.sa()
        la = []
        for i in sa:
            la.append(long(i))
        return la

    def da(self):
        sa = self.sa()
        da = []
        for i in sa:
            da.append(float(i))
        return da

    def im(self, N):
        im = []
        for i in range(N):
            im.append(self.ia())
        return im

    def lm(self, N):
        lm = []
        for i in range(N):
            lm.append(self.la())
        return lm

    def dm(self, N):
        dm = []
        for i in range(N):
            dm.append(self.da())
        return dm

if __name__ == "__main__":
    reader = Reader(sys.stdin)
    N = reader.i()
    print((N - 1) / 2)