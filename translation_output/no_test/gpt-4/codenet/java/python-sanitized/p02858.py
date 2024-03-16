import sys
import math

class Modular:
    def __init__(self, m):
        if not isinstance(m, int) or m <= 0:
            raise ValueError("Modulus must be a positive integer.")
        self.m = m

    def value_of(self, x):
        return ((x % self.m) + self.m) % self.m

    def mul(self, x, y):
        return self.value_of(x * y)

    def add(self, x, y):
        return self.value_of(x + y)

    def subtract(self, x, y):
        return self.value_of(x - y)

    def get_modular_for_power_computation(self):
        return Modular(self.m - 1)

class Power:
    def __init__(self, modular):
        self.modular = modular

    def pow(self, x, n):
        if n == 0:
            return self.modular.value_of(1)
        r = self.pow(x, n >> 1)
        r = self.modular.mul(r, r)
        if n & 1:
            r = self.modular.mul(r, x)
        return r

def gcd(a, b):
    if a < b:
        a, b = b, a
    while b:
        a, b = b, a % b
    return a

def solve(h, w, t):
    mod_value = 10**9 + 7
    mod = Modular(mod_value)
    pow_mod = mod.get_modular_for_power_computation()
    pow = Power(mod)

    hh = h // gcd(h, t)
    ww = w // gcd(w, t)
    
    way = 1
    way = mod.add(way, mod.subtract(pow.pow(2, hh), 2))
    way = mod.add(way, mod.subtract(pow.pow(2, ww), 2))
    way = mod.add(way, pow.pow(2, gcd(hh, ww)))

    p = pow_mod.mul(h // hh, w // ww)
    
    way = pow.pow(way, p)
    return way

def main():
    h, w, t = map(int, input().split())
    answer = solve(h, w, t)
    print(answer)
    
if __name__ == "__main__":
    main()