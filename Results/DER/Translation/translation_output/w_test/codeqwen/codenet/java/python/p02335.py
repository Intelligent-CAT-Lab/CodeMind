Here is the Python equivalent of the Java code:

```python
class Combinatrics:
    def __init__(self, k):
        self.mod = 1000000007
        self.fact = [1] * (k+1)
        self.inv = [1] * (k+1)
        self.finv = [1] * (k+1)
        for i in range(2, k+1):
            self.fact[i] = self.fact[i-1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod%i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i-1] * self.inv[i] % self.mod

    def inv(self, n):
        return self.inv[n]

    def factorial(self, n):
        return self.fact[n]

    def factInv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % self.mod * self.finv[n-r] % self.mod

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n-r] % self.mod

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n+r-1, r)

class FastScanner:
    def __init__(self):
        self.inp = input()
        self.ptr = 0
        self.buflen = len(self.inp)

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.inp = input()
            self.buflen = len(self.inp
