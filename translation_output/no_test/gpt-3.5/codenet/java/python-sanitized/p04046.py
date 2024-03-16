MOD = 1000000007

class ModInt:
    def __init__(self, l):
        self.x = l % MOD

    def add(self, mi):
        return ModInt(self.x + mi.x)

    def mul(self, i):
        return ModInt(self.x * i)

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
        return str(int(self.x))


class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [ModInt(0) for _ in range(n + 1)]
        self.inv = [ModInt(0) for _ in range(n + 1)]

    def makeFac(self):
        for i in range(self.size + 1):
            if i == 0:
                self.fac[i] = ModInt(1)
            else:
                self.fac[i] = self.fac[i - 1].mul(i)
            self.inv[i] = self.fac[i].inv()

    def combFac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n].mul(self.inv[k]).mul(self.inv[n - k])


def solve():
    h, w, a, b = map(int, input().split())
    mc = ModComb(200005)
    mc.makeFac()
    res = ModInt(0)
    for i in range(h - a):
        res = res.add(mc.combFac(b - 1 + i, i).mul(mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)))
    print(res)


if __name__ == "__main__":
    solve()