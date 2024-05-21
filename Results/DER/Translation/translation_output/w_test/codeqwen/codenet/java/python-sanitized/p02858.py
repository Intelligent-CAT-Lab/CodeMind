import sys

class GCDs:
    @staticmethod
    def gcd(a, b):
        return a if b == 0 else GCDs.gcd(b, a % b)

class Modular:
    def __init__(self, m):
        self.m = m

    def valueOf(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.valueOf(x * y)

    def plus(self, x, y):
        return self.valueOf(x + y)

    def subtract(self, x, y):
        return self.valueOf(x - y)

    def getModularForPowerComputation(self):
        return Modular(self.m - 1)

    def __str__(self):
        return "mod " + str(self.m)

class Power:
    def __init__(self, modular):
        self.modular = modular

    def pow(self, x, n):
        if n == 0:
            return self.modular.valueOf(1)
        r = self.pow(x, n >> 1)
        r = self.modular.valueOf(r * r)
        if (n & 1) == 1:
            r = self.modular.valueOf(r * x)
        return r

class FDISCOSMOS:
    def solve(self, testNumber, inp, out):
        h = inp.readInt()
        w = inp.readInt()
        t = inp.readInt()

        hh = h // GCDs.gcd(h, t)
        ww = w // GCDs.gcd(w, t)

        mod = Modular(10**9 + 7)
        pow = Power(mod)
        way = 1
        way = mod.plus(way, mod.subtract(pow.pow(2, hh), 2))
        way = mod.plus(way, mod.subtract(