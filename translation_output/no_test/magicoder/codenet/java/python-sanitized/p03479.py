import sys
import time

class p03479:
    def __init__(self):
        self.is = sys.stdin
        self.out = sys.stdout
        self.INPUT = ""

    def solve(self):
        x = self.nl()
        y = self.nl()
        ans = 0
        for i in range(x, y + 1):
            if i % 2 == 0:
                ans += 1
        self.out.write(str(ans) + "\n")

    def run(self):
        s = time.time()
        self.solve()
        self.out.flush()
        if self.INPUT != "":
            print(time.time() - s, "ms")

    def main(self):
        self.run()

    def readByte(self):
        if self.lenbuf == -1:
            raise Exception("InputMismatchException")
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.is.read(self.inbuf)
            except Exception:
                raise Exception("InputMismatchException")
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf]

    def isSpaceChar(self, c):
        return not (c >= 33 and c <= 126)

    def skip(self):
        b = self.readByte()
        while self.isSpaceChar(b):
            b = self.readByte()
        return b

    def nd(self):
        return float(self.ns())

    def nc(self):
        return chr(self.skip())

    def ns(self):
        b = self.skip()
        sb = ""
        while not self.isSpaceChar(b):
            sb += chr(b)
            b = self.readByte()
        return sb

    def ns(self, n):
        b = self.skip()
        buf = ""
        while len(buf) < n and not self.isSpaceChar(b):
            buf += chr(b)
            b = self.readByte()
        return buf

    def nm(self, n, m):
        map = []
        for i in range(n):
            map.append(self.ns(m))
        return map

    def na(self, n):
        a = []
        for i in range(n):
            a.append(self.ni())
        return a

    def ni(self):
        num = 0
        b = self.readByte()
        minus = False
        while not ((b >= ord('0') and b <= ord('9')) or b == ord('-')):
            b = self.readByte()
        if b == ord('-'):
            minus = True