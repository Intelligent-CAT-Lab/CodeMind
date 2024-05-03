Here is the Python equivalent of the Java code you provided:

```python
import sys

class ERoaming:
    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.factinv = [1] * (n + 1)
        self.mod = 1000000007
        self.n = n
        self.gen()

    def gen(self):
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1]
            self.fact[i] %= self.mod
            self.factinv[i] = pow(self.fact[i], self.mod - 2, self.mod)

    def solve(self, k):
        if k >= self.n:
            return pow(self.n + self.n - 1, self.n - 1, self.mod)
        else:
            ans = 0
            for i in range(k + 1):
                up = self.fact[self.n] * self.fact[self.n - 1]
                up %= self.mod
                den1 = self.factinv[i] * self.factinv[i]
                den1 %= self.mod
                den2 = self.factinv[self.n - i] * self.factinv[self.n - i - 1]
                den2 %= self.mod
                den = den1 * den2
                den %= self.mod
                ans += up * den
                ans %= self.mod
            return ans

class Maths:
    @staticmethod
    def nCrs(n, r, p):
        up = 1
        down = 1
        for i in range(n - r + 1, n + 1):
            up *= i
            up %= p
        for i in range(1, r + 1):
            down *= i
            down %= p
        return (up * pow(down, p - 2, p)) % p

class InputReader:
    def __init
