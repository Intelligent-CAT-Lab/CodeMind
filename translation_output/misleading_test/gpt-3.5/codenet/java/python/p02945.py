```python
import sys

class FastScanner:
    def readByte(self):
        return self.buffer[self.ptr]

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = sys.stdin.buffer.read(1024)
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

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
            raise NoSuchElementException()
        sb = ""
        b = self.readByte()
        while self.isPrintableChar(b):
            sb += chr(b)
            b = self.readByte()
        return sb

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # '-'
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:  # '0' and '9'
            raise NumberFormatException()
        while True:
            if 48 <= b <= 57:  # '0' and '9'
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.readByte()

class Solver:
    def __init__(self):
        self.sc = FastScanner()

    def ns(self):
        return self.sc.next()

    def ni(self):
        return int(self.sc.nextLong())

    def prt(self, x=""):
        sys.stdout.write(str(x))

    def prtln(self, x=""):
        sys.stdout.write(str(x) + "\n")

    def solve(self):
        a = self.ni()
        b = self.ni()
        self.prtln(max(a + b, a - b, a * b))

solver = Solver()
solver.solve()
```
```
