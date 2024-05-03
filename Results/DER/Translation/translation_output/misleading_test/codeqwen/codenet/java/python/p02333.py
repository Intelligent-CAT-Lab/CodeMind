Here is the Python equivalent of the Java code:

```python
import sys

class Combinatrics:
    mod = 1000000007
    fact = [1]
    inv = [1]
    finv = [1]

    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [1] * N
        self.inv = [1] * N
        self.finv = [1] * N
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.mod

    def inv(self, n):
        return self.inv[n]

    def factorial(self, n):
        return self.fact[n]

    def factInv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % self.mod * self.finv[n - r] % self.mod

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n - r] % self.mod

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)

    def surjection(self, n, k):
        ans = 0
        sign = 1
        if k % 2 == 0:
            sign = -1
        for i in range(1, k + 1):
            if sign == 1:
                ans += self.combination(k, i) *
