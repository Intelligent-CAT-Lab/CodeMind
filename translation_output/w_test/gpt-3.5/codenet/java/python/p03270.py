```python
import sys

MOD = 998244353

class Modulo:
    mod = MOD
    nors = []
    revs = []

    def __init__(self, value):
        self.value = value

    @staticmethod
    def add(a, b):
        return ((a + b) % Modulo.mod + Modulo.mod) % Modulo.mod

    @staticmethod
    def mlt(a, b):
        return (a * b) % Modulo.mod

    @staticmethod
    def rev(a):
        def extgcd(a, b):
            if a == 0:
                return 0, 1, b
            x, y, d = extgcd(b % a, a)
            return y - (b // a) * x, x, d
        return (extgcd(a, Modulo.mod)[0] % Modulo.mod + Modulo.mod) % Modulo.mod

    @staticmethod
    def pow(a, x):
        ans = 1 % Modulo.mod
        while x > 0:
            if x & 1:
                ans = (ans * a) % Modulo.mod
            x >>= 1
            a = (a * a) % Modulo.mod
        return ans

    def add(self, a):
        self.value = self.add(self.value, a)
        return self

    def mlt(self, a):
        self.value = self.mlt(self.value, a)
        return self

    @staticmethod
    def build_combination(n):
        Modulo.nors = [0] * (n + 1)
        Modulo.revs = [0] * (n + 1)

        Modulo.nors[0] = 1
        for i in range(1, n + 1):
            Modulo.nors[i] = Modulo.mlt(Modulo.nors[i - 1], i)

        Modulo.revs[n] = Modulo.rev(Modulo.nors[n])
        for i in range(n - 1, -1, -1):
            Modulo.revs[i] = Modulo.mlt(Modulo.revs[i + 1], i + 1)

    @staticmethod
    def h(n, k):
        return 1 if k <= 0 else Modulo(Modulo.nors[n + k - 1]).mlt(Modulo.revs[n]).mlt(Modulo.revs[k - 1]).value

    @staticmethod
    def c(n, k):
        return 0 if n - k < 0 else Modulo(Modulo.nors[n]).mlt(Modulo.revs[k]).mlt(Modulo.revs[n - k]).value

    def getValue(self):
        return self.value

    def setValue(self, value):
        self.value = value

    def __str__(self):
        return str(self.value)

def calc(i, n, k):
    ret = Modulo(0)
    p = 0
    for j in range(1, i - j):
        if i - j <= k:
            p += 1
    l = k - 2 * p - (1 if i % 2 == 0 else 0)
    for q in range(min(n, p) + 1):
        if l == 0 and q == 0:
            continue
        tmp = Modulo(1)
        tmp.mlt(Modulo.c(p, q))
        tmp.mlt(Modulo.pow(2, q))
        tmp.mlt(Modulo.h(n - q, q + l))
        ret.add(tmp)
    return ret.getValue()

def solve():
    k, n = map(int, input().split())

    Modulo.mod = MOD
    Modulo.build_combination(5000)

    for i in range(2, 2 * k + 1):
        ans = Modulo(0)
        ans.add(calc(i, n, k))
        if i % 2 == 0:
            ans.add(calc(i, n - 1, k))
        print(ans)

if __name__ == "__main__":
    solve()
```
```
