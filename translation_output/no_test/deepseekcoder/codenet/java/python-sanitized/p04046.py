import sys
from typing import List

MOD = 1000000007

class ModInt:
    def __init__(self, x):
        self.x = x % MOD

    def add(self, mi):
        return ModInt((self.x + mi.x) % MOD)

    def mul(self, mi):
        if isinstance(mi, ModInt):
            mi = mi.x
        return ModInt((self.x * mi) % MOD)

    def pow(self, p):
        res = ModInt(1)
        tmp = self
        while p > 0:
            if p & 1:
                res = res.mul(tmp)
            tmp = tmp.mul(tmp)
            p //= 2
        return res

    def inv(self):
        return self.pow(MOD - 2)

    def __str__(self):
        return str(self.x)


class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [ModInt(0)] * (n + 1)
        self.inv = [ModInt(0)] * (n + 1)
        self.make_fac()

    def make_fac(self):
        self.fac[0] = ModInt(1)
        for i in range(1, self.size + 1):
            self.fac[i] = self.fac[i - 1].mul(i)
            self.inv[i] = self.fac[i].inv()

    def comb_fac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n].mul(self.inv[k]).mul(self.inv[n - k])


def solve(testNumber, inp, out):
    h = int(inp.readline())
    w = int(inp.readline())
    a = int(inp.readline())
    b = int(inp.readline())
    mc = ModComb(200005)
    res = ModInt(0)
    for i in range(h - a):
        res = res.add(mc.comb_fac(b - 1 + i, i).mul(mc.comb_fac(w - b - 1 + h - 1 - i, h - 1 - i)))
    out.write(str(res) + '\n')


def main():
    inp = sys.stdin
    out = sys.stdout
    solve(1, inp, out)
    out.close()


if __name__ == "__main__":
    main()