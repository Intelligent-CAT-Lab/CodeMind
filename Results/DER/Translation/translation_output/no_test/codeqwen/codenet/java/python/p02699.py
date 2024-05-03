```python
import sys
import math

class p02699:
    INF = sys.maxsize // 2
    MOD = 10**9 + 7
    SIZE = 10**6

    def solve(self):
        s = self.sc.nextInt()
        w = self.sc.nextInt()

        if w >= s:
            print("unsafe")
        else:
            print("safe")

    def gcd(self, a, b):
        if b == 0:
            return a
        return self.gcd(b, a % b)

    def lcm(self, a, b):
        return a * b // self.gcd(a, b)

    def inv(self, a):
        return self.pow(a, self.MOD - 2)

    def pow(self, a, r):
        sum = 1
        while r > 0:
            if r & 1 == 1:
                sum *= a
                sum %= self.MOD
            a *= a
            a %= self.MOD
            r >>= 1
        return sum

    def modFact(self, n):
        if n == 0:
            return 1
        return n * self.modFact(n - 1) % self.MOD

    def fact(self, n):
        if n == 0:
            return 1
        return n * self.fact(n - 1)

    def initCOMB(self):
        self.fac[0] = self.fac[1] = 1
        self.inv[1] = 1
        self.finv[0] = self.finv[1] = 1
        for i in range(2, self.SIZE):
            self.fac[i] = self.fac[i - 1] * i % self.MOD
            self.inv[i] = self.MOD - self.inv[self.MOD % i] * (self.MOD // i) % self.MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.MOD

    def mod
