Here is the Python translation of the Java code:

```python
import sys

class ModMath:
    DEFAULT_MOD = 10**9 + 7

    def __init__(self, mod=DEFAULT_MOD):
        self.mod = mod

    def mod(self, x):
        x %= self.mod
        return x if x >= 0 else x + self.mod

    def inv(self, x):
        return self.mod(pow(x, -1, self.mod))

    def pow(self, x, y):
        if y < 0:
            return self.pow(self.inv(x), -y)
        elif y == 0:
            return 1
        elif y % 2 == 0:
            z = self.pow(x, y // 2)
            return (z * z) % self.mod
        else:
            return (x % self.mod) * self.pow(x, y - 1) % self.mod

    def npr(self, n, r):
        if n < r:
            return 0
        ans = 1
        for i in range(r):
            ans *= (n - i)
            ans %= self.mod
        return ans

    def ncr(self, n, r):
        return self.mod(self.npr(n, r) * self.inv(self.npr(r, r)))

    def get_factorial(self, n):
        return Factorial(self, n)

    def get_exponentiation(self, base, max):
        return Exponentiation(self, base, max)


class Exponentiation:
    def __init__(self, mod, base, max):
        self.mod = mod
        self.base = base
        self.max = max
        self.natural = [1] * max
        self.reverse = [1] * max
        for i in range(1, max):
            self.natural[i] = self.mod(self.natural[i - 1] * base)
        for i in range(max - 1, -1, -1):
            self.reverse[
