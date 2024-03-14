import io
import sys
import time

class p03479:
    def __init__(self):
        self.is = None
        self.out = None
        self.INPUT = ""

    def solve(self):
        x = self.nl()
        y = self.nl()
        ans = 0
        for i in range(x, y+1):
            if i & (i-1) == 0:
                ans += 1
        print(ans)

    def run(self):
        self.is = io.StringIO(self.INPUT) if self.INPUT else sys.stdin
        self.out = sys.stdout
        s = time.time()
        self.solve()
        self.out.flush()
        if self.INPUT: print(time.time()-s, "ms")

    def main(self):
        self.run()

    def readByte(self):
        return self.is.read(1)

    def isSpaceChar(self, c):
        return not (c >= 33 and c <= 126)

    def skip(self):
        b = self.readByte()
        while b != "" and self.isSpaceChar(ord(b)):
            b = self.readByte()
        return b

    def nd(self):
        return float(self.ns())

    def nc(self):
        return ord(self.skip())

    def ns(self):
        b = self.skip()
        s = ""
        while b != "" and not self.isSpaceChar(ord(b)):
            s += b
            b = self.readByte()
        return s

    def ni(self):
        num = ""
        b = self.readByte()
        while b != "" and (b >= '0' and b <= '9' or b == '-'):
            num += b
            b = self.readByte()
        return int(num)

    def nl(self):
        num = ""
        b = self.readByte()
        while b != "" and (b >= '0' and b <= '9' or b == '-'):
            num += b
            b = self.readByte()
        return int(num)

    def tr(self, *o):
        print(o)

if __name__ == "__main__":
    p03479().main()