import sys

def solve(h, w, a, b):
    mc = ModComb(200005)
    mc.makeFac()
    res = ModInt(0)
    for i in range(h - a):
        res = res + mc.combFac(b - 1 + i, i) * mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)
    return res

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    res = solve(h, w, a, b)
    print(res)

class ModInt:
    MOD = 1000000007
    def __init__(self, l):
        self.x = l % MOD

    def add(self, mi):
        return ModInt(self.x + mi.x)

    def mul(self, i):
        return ModInt(self.x * i)

    def mul(self, mi):
        return ModInt(self.x * mi.x)

    def pow(self, p):
        res = ModInt(1)
        tmp = self
        while p > 0:
            if (p & 1) == 1:
                res = res * tmp
            tmp = tmp * tmp
            p /= 2
        return res

    def inv(self):
        return self.pow(MOD - 2)

    def __str__(self):
        return str(int(self.x))

class ModComb:
    def __init__(self, n):
        self.size = n
        self.fac = [ModInt(1)] * (n + 1)
        self.inv = [ModInt(1)] * (n + 1)

    def makeFac(self):
        for i in range(1, self.size + 1):
            self.fac[i] = self.fac[i - 1] * i
            self.inv[i] = self.fac[i].inv()

    def combFac(self, n, k):
        if n < k:
            return ModInt(0)
        return self.fac[n] * self.inv[k] * self.inv[n - k]

if __name__ == "__main__":
    main()