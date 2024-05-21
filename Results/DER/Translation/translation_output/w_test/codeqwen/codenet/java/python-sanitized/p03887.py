import sys

class ModCalculator:
    def __init__(self, mod):
        self.mod = mod

    def add(self, a, b):
        return (a + b) % self.mod

    def sub(self, a, b):
        return (a - b + self.mod) % self.mod

    def mul(self, a, b):
        return (a * b) % self.mod

    def pow(self, a, b):
        if b == 0:
            return 1
        v = self.pow(self.mul(a, a), b // 2)
        if b % 2 == 1:
            return self.mul(v, a)
        else:
            return v

    def inverse(self, a):
        return self.pow(a, self.mod - 2)

    def div(self, a, b):
        return self.mul(a, self.inverse(b))


class ModCombinationCache:
    def __init__(self, mod_calculator):
        self.mod_calculator = mod_calculator
        self.factorial_cache = [1]
        self.factorial_inverse_cache = [1]

    def resize(self, n):
        while len(self.factorial_cache) <= n:
            v = self.mod_calculator.mul(self.factorial_cache[-1], len(self.factorial_cache))
            self.factorial_cache.append(v)
            self.factorial_inverse_cache.append(self.mod_calculator.inverse(v))

    def get_p(self, n):
        self.resize(n)
        return self.factorial_cache[n]

    def get_c(self, n, k):
        self.resize(n)
        return self.mod_calculator.mul(self.factorial_cache[n], self.mod_calculator.mul(self.factorial_inverse_cache[k], self.factorial_inverse_cache[n-k]))