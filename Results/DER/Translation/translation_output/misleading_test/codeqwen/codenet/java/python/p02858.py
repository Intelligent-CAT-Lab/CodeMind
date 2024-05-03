Here is the Python version of the provided Java code:

```python
import math

class GCDs:
    @staticmethod
    def gcd(a, b):
        return a if b == 0 else GCDs.gcd(b, a % b)

class Modular:
    def __init__(self, m):
        self.m = m

    def value_of(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.value_of(x * y)

    def plus(self, x, y):
        return self.value_of(x + y)

    def subtract(self, x, y):
        return self.value_of(x - y)

    def get_modular_for_power_computation(self):
        return Modular(self.m - 1)

    def __str__(self):
        return "mod " + str(self.m)

class Power:
    def __init__(self, modular):
        self.modular = modular

    def pow(self, x, n):
        if n == 0:
            return self.modular.value_of(1)
        r = self.pow(x, n >> 1)
        r = self.modular.value_of(r * r)
        if (n & 1) == 1:
            r = self.modular.value_of(r * x)
        return r

class FDISCOSMOS:
    def solve(self, test_number, inp, out):
        h = inp.read_int()
        w = inp.read_int()
        t = inp.read_int()

        hh = h // math.gcd(h, t)
        ww = w // math.gcd(w, t)

        mod = Modular(10**9 + 7)
        pow = Power(mod)
        way = 1
        way = mod.plus(way, mod.subtract(pow.pow(2, hh), 2))
        way =
