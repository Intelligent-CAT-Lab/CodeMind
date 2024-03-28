import io
import sys
import os
from math import gcd


class Modular:
    def __init__(self, m):
        self.m = m

    def value_of(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, a, b):
        return self.value_of(a * b)

    def subtract(self, a, b):
        return self.value_of(a - b)

    def plus(self, a, b):
        return self.value_of(a + b)


class Composite:
    def __init__(self, fact, inv_fact, modulo):
        self.fact = fact
        self.inv_fact = inv_fact
        self.mod = modulo

    def composite(self, m, n):
        if n > m:
            return 0
        return self.mod.mul(self.mod.mul(self.fact[m], self.inv_fact[n]), self.inv_fact[m - n])


class BitOperator:
    def bit_at(self, x, i):
        return (x >> i) & 1


def in_range(n, m, comp):
    return comp.composite(m + n, n)


def solve(n, m, l, r):
    mod = Modular(1_000_000_007)
    l_part = m
    r_part = n - m
    
    fact = [1] * (n + 1)
    inv_fact = [1] * (n + 1)
    for i in range(2, n + 1):
        fact[i] = mod.mul(fact[i - 1], i)
        inv_fact[i] = pow(fact[i], mod.m - 2, mod.m)
    comp = Composite(fact, inv_fact, mod)
    
    bo = BitOperator()
    sum_ = mod.subtract(in_range(n, r, comp), in_range(n, l - 1, comp))
    cache1 = [0] * (r + 1)
    cache2 = [0] * (r + 1)

    # ei
    for x in range(1, len(cache1)):
        local_sum = 0
        for j in range(r_part + 1):
            c = comp.composite(r_part, j)
            number_of_x = l_part + j
            sub = number_of_x * x
            if sub > r:
                break
            plus = mod.mul(c, mod.subtract(in_range(n, r - sub, comp), in_range(n, l - 1 - sub, comp)))
            if bo.bit_at(j, 0) == 1:
                plus = -plus
            local_sum = mod.plus(local_sum, plus)
        cache1[x] = mod.mul(local_sum, comp.composite(n, l_part))

    # min{