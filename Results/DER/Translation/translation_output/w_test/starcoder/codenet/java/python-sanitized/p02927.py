import sys

class p02927:
    def __init__(self):
        self.in_ = self.InStream()
        self.out_ = self.OutStream()
        self.MOD = 1000000007
        self.ans = 0

    def solve(self):
        M = self.in_.nextInt()
        D = self.in_.nextInt()
        for m in range(1, M+1):
            for d in range(1, D+1):
                d1 = d % 10
                d2 = d // 10
                if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                    self.ans += 1

    def m(self):
        self.solve()
        self.out_.println(self.ans)

    class InStream:
        def __init__(self):
            self.buf = sys.stdin.buffer
            self.off = 0
            self.end = 0

        def read(self):
            if self.off >= self.end:
                self.off = 0
                self.end = self.buf.read(4096).find(b'\n')
                if self.end == -1:
                    self.end = self.buf.read(4096).find(b'')
                    if self.end == -1:
                        return -1
            ret = self.buf[self.off]
            self.off += 1
            return ret

        def readInt(self):
            ret = 0
            neg = False
            b = self.read()
            while b!= -1 and b < ord('0') and b!= ord('-'):
                b = self.read()
            if b == ord('-'):
                neg = True
                b = self.read()
            while b!= -1 and b >= ord('0') and b <= ord('9'):
                ret = ret * 10 + b - ord('0')
                b = self.read()
            return -ret if neg else ret

        def readLong(self):
            ret = 0
            neg = False
            b = self.read()