import sys

class ModInt:
    MOD = 1000000007

    def __init__(self, x):
        self.x = x % ModInt.MOD

    def add(self, mi):
        return ModInt((self.x + mi.x) % ModInt.MOD)

    def mul(self, i):
        return ModInt((self.x * i) % ModInt.MOD)

    def mul(self, mi):
        return ModInt((self.x * mi.x) % ModInt.MOD)

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
        return self.pow(ModInt.MOD - 2)

    def __str__(self):
        return str(self.x)


class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [ModInt(0)] * (n + 1)
        self.inv = [ModInt(0)] * (n + 1)
        self.make_fac()

    def make_fac(self):
        for i in range(self.size + 1):
            if i == 0:
                self.fac[i] = ModInt(1)
            else:
                self.fac[i] = self.fac[i - 1].mul(i)
            self.inv[i] = self.fac[i].inv()

    def comb_fac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n].mul(self.inv[k]).mul(self.inv[n - k])


def solve(test_number, in_stream, out_stream):
    h, w, a, b = map(int, in_stream.readline().split())
    mc = ModComb(200005)
    res = ModInt(0)
    for i in range(h - a):
        res = res.add(mc.comb_fac(b - 1 + i, i).mul(mc.comb_fac(w - b - 1 + h - 1 - i, h - 1 - i)))
    out_stream.write(str(res) + '\n')


if __name__ == "__main__":
    solve(1, sys.stdin, sys.stdout)