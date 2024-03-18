```python
import sys
from collections import defaultdict

class ModMath:
    default_mod = 1000000007

    def __init__(self, mod=default_mod):
        self.mod = mod

    def mod(self, x):
        x %= self.mod
        return x if x >= 0 else x + self.mod

    def inv(self, x):
        return self.mod(self.solve(x, -self.mod)[0])

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

    def ncr(self, n, r):
        div = 1
        for i in range(2, r + 1):
            div *= i
            div %= self.mod
        return self.mod(self.npr(n, r) * self.inv(div))

    @staticmethod
    def solve(p, q):
        if q == 0:
            return p, 1, p
        vals = ModMath.solve(q, p % q)
        a = vals[1]
        b = vals[0] - (p // q) * a
        return a, b, vals[2]

    def npr(self, n, r):
        if n < r:
            return 0
        ans = 1
        for i in range(r):
            ans *= (n - i)
            ans %= self.mod
        return ans

def solve(n, m):
    mod = ModMath(m)
    ans = 0
    for r in range(1, n):
        b = n - r

        t = mod.ncr(n, r)
        t *= mod.pow(2, r * (r - 1) // 2)
        t %= m

        t *= mod.pow(2, b * (b - 1) // 2)
        t %= m

        p = 0
        fact = mod.getFactorial(b + 1)
        for i in range(b + 1):
            if i % 2 == 0:
                p += fact.ncr(b, i) * mod.pow((mod.pow(2, b - i) - 1), r) % m
                p %= m
            else:
                p -= fact.ncr(b, i) * mod.pow((mod.pow(2, b - i) - 1), r) % m
                p %= m
        if p < 0:
            p += m

        t *= p
        t %= m

        ans += t
        ans %= m

    return ans

if __name__ == "__main__":
    n, m = map(int, input().split())
    result = solve(n, m)
    print(result)
```
```
