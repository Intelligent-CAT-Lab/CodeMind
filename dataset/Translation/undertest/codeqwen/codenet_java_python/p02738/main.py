import sys

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

    def __str__(self):
        return "mod " + str(self.m)

class Factorial:
    def __init__(self, limit, modular):
        self.modular = modular
        self.fact = [1] * (limit + 1)
        self.inv = [1] * (limit + 1)
        for i in range(2, limit + 1):
            self.fact[i] = modular.mul(self.fact[i - 1], i)
            self.inv[i] = modular.mul(self.inv[i - 1], modular.mul(-i, self.inv[i % i]))

class InverseNumber:
    def __init__(self, limit, modular):
        self.inv = [1] * (limit + 1)
        self.modular = modular
        for i in range(2, limit + 1):
            self.inv[i] = modular.mul(-self.modular.mul(self.modular.getMod() // i, self.inv[self.modular.getMod() % i]), self.inv[i % i])

class Combination:
    def __init__(self, factorial):
        self.factorial = factorial

class DMergeTriplets:
    def __init__(self):
        self.mod = None
        self.comb = None
        self.zero = None
        self.f = None

    def f(self, i, j):
        if i == 0:
            return j == self.zero
        if i < 0 or j >= self.f[i].__len__() or j < 0