```python
import sys

class Combinatrics:
    mod = 1000000007

    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [0] * N
        self.inv = [0] * N
        self.finv = [0] * N
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.mod

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % self.mod * self.finv[n - r] % self.mod)

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)


class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = self.inp.read(1024)
            if not self.buffer:
                return False
            self.buflen = len(self.buffer)
        return True

    def readByte(self):
        if self.hasNextByte():
            res = self.buffer[self.ptr]
            self.ptr += 1
            return res
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        res = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            res.append(b)
            b = self.readByte()
        return res.decode()

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # '-' character ASCII value
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:
            raise ValueError
        while True:
            if 48 <= b <= 57:
                n = n * 10 + (b - 48)
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return nl

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

sc = FastScanner()
n = sc.nextInt()
k = sc.nextInt()
c = Combinatrics(n-1)
print(c.homogeneous(k, n-k))
```

