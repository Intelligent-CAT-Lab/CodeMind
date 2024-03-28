import sys
from collections import defaultdict


class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.buffer = b""
        self.ptr = 0

    def hasNextByte(self):
        if self.ptr < len(self.buffer):
            return True
        else:
            self.ptr = 0
            self.buffer = self.inp.read(1024)
            if not self.buffer:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            val = self.buffer[self.ptr]
            self.ptr += 1
            return val
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise ValueError("No more elements to read")
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()

    def nextLong(self):
        if not self.hasNext():
            raise ValueError("No more elements to read")
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:
            raise ValueError("Invalid long format")
        while True:
            if 48 <= b <= 57:
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError("Invalid long format")
            b = self.readByte()


class Solver:
    def __init__(self):
        self.sc = FastScanner()
        self.out = sys.stdout

    def solve(self):
        n = self.sc.nextLong()
        p = self.sc.nextLong()
        factor = self.factorize(p)
        ans = 1
        for i in range(len(factor)):
            if factor[i][1] >= n:
                ans *= factor[i][0] ** (factor[i][1] // n)
        self.prtln(ans)

    def prt(self):
        self.out.write("")

    def prtln(self, *args):
        self.out.write(" ".join(map(str, args)) + "\n")

    def factorize(self, num):
        factors = []
        for i in range(2, int(num ** 0.5) + 1):
            count = 0
            while num % i == 0:
                count += 1
                num //= i
            if count > 0:
                factors.append([i, count])
        if num > 1:
            factors.append([num, 1])
        return factors


solver = Solver()
solver.solve()