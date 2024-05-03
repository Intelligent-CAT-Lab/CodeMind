Here is the Python equivalent of the Java code:

```python
import sys

class ERoaming:
    def __init__(self):
        self.fact = [1]
        self.factinv = [1]
        self.mod = 1000000007
        self.n = 0

    def gen(self):
        for i in range(1, self.n + 1):
            self.fact.append((self.fact[-1] * i) % self.mod)
            self.factinv.append(pow(self.fact[-1], self.mod - 2, self.mod))

    def solve(self, testNumber, inp):
        self.n = inp.nextLong()
        k = inp.nextLong()
        if k >= self.n:
            print(self.nCrs(self.n + self.n - 1, self.n - 1, self.mod))
        else:
            ans = 0
            self.gen()
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
            print(ans)

    def nCrs(self, n, r, p):
        up = 1
        down = 1
        for i in range(n - r + 1, n + 1):
            up *= i
            up %= p
        for i in range(1, r + 1):
            down *= i
            down %= p
        return (up * pow(down, p - 2, p)) % p

class Maths:
    @staticmethod
    def n
