Here is the Python equivalent of the Java code:

```python
import sys

class Combinatrics:
    mod = 1000000007
    fact = [1]
    inv = [1]
    finv = [1]

    def __init__(self, n):
        for i in range(len(self.fact), n+1):
            self.fact.append((self.fact[-1] * i) % self.mod)
            self.inv.append((self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod) % self.mod)
            self.finv.append((self.finv[-1] * self.inv[i]) % self.mod)

    def inv(self, n):
        return self.inv[n]

    def factorial(self, n):
        return self.fact[n]

    def factInv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] * self.finv[n-r]) % self.mod

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[n-r]) % self.mod

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n+r-1, r)

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read()
        self.ptr = 0
        self.buflen = len(self.buffer)

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = sys.stdin.read()
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
