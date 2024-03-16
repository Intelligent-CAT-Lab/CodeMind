import sys
import math

class ERoaming:
    def __init__(self):
        self.fact = []
        self.factinv = []
        self.mod = 1000000007
        self.n = 0

    def gen(self):
        self.fact = [1] * (self.n + 1)
        self.factinv = [1] * (self.n + 1)
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1]
            self.fact[i] %= self.mod
            self.factinv[i] = self.power(self.fact[i], self.mod - 2, self.mod)

    def solve(self, testNumber, inp, out):
        self.n = int(inp.readline())
        k = int(inp.readline())
        if k >= self.n:
            out.write(str(self.nCrs(self.n + self.n - 1, self.n - 1, self.mod)))
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
            out.write(str(ans))

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
        return (up * ERoaming.power(down, p - 2, p)) % p

    @staticmethod
    def power(x, y, p):
        res = 1
        x = x % p
        while y > 0:
            if y & 1:
                res = (res * x) % p
            y = y >> 1
            x = (x * x) % p
        return res


if __name__ == "__main__":
    inp = sys.stdin
    out = sys.stdout
    solver = ERoaming()
    solver.solve(1, inp, out)
    out.close()