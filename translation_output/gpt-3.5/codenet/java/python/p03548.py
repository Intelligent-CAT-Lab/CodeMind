```python
import sys
from collections import defaultdict
from io import BytesIO
input = BytesIO(sys.stdin.buffer.read()).readline

class Solver:
    def __init__(self):
        self.sc = FastScanner()

    def ns(self):
        return self.sc.next()

    def ni(self):
        return self.sc.nextLong()

    def solve(self):
        x = self.ni()
        y = self.ni()
        z = self.ni()
        print((x - z) // (y + z))

class FastScanner:
    def __init__(self):
        self.buffer = BytesIO()
        self.buffer.write(sys.stdin.buffer.read())
        self.buffer.seek(0)
        self.ptr = 0

    def hasNextByte(self):
        return self.ptr < len(self.buffer.getvalue())

    def readByte(self):
        if self.hasNextByte():
            val = self.buffer.getvalue()[self.ptr]
            self.ptr += 1
            return val
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer.getvalue()[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.extend([b])
            b = self.readByte()
        return sb.decode().strip()

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == ord(b'-'):
            minus = True
            b = self.readByte()
        if not ord(b'0') <= b <= ord(b'9'):
            raise ValueError
        while True:
            if ord(b'0') <= b <= ord(b'9'):
                n *= 10
                n += b - ord(b'0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

solver = Solver()
solver.solve()
```

