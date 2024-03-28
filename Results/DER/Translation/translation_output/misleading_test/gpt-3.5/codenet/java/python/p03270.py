```python
import sys
from io import BytesIO, IOBase

class Modulo:
    mod = 998244353
    nors = []
    revs = []

    def __init__(self, value):
        self.value = value

    @classmethod
    def add(cls, a, b):
        return ((a + b) % cls.mod + cls.mod) % cls.mod

    @classmethod
    def mlt(cls, a, b):
        return (a * b) % cls.mod

    @classmethod
    def rev(cls, a):
        return (cls.extgcd(a, cls.mod)[0] % cls.mod + cls.mod) % cls.mod

    @classmethod
    def pow(cls, a, x):
        ans = 1 % cls.mod
        while x > 0:
            if x & 1:
                ans = (ans * a) % cls.mod
            x >>= 1
            a = (a * a) % cls.mod
        return ans

    def add_value(self, a):
        self.value = self.add(self.value, a)

    def add_modulo(self, m):
        self.value = self.add(self.value, m.get_value())

    def mlt_value(self, a):
        self.value = self.mlt(self.value, a)

    @classmethod
    def extgcd(cls, a, b):
        is_ = [0, 1, b]
        if a == 0:
            is_[0] = 0
            is_[1] = 1
            is_[2] = b
        else:
            cls.extgcd(b % a, a)
            x = is_[1] - b // a * is_[0]
            is_[1] = is_[0]
            is_[0] = x
        return is_

    @classmethod
    def build_combination(cls, n):
        cls.nors = [0] * (n + 1)
        cls.revs = [0] * (n + 1)

        cls.nors[0] = 1
        for i in range(1, n + 1):
            cls.nors[i] = cls.mlt(cls.nors[i - 1], i)

        cls.revs[n] = cls.rev(cls.nors[n])
        for i in range(n - 1, -1, -1):
            cls.revs[i] = cls.mlt(cls.revs[i + 1], i + 1)

    @classmethod
    def h(cls, n, k):
        return 1 if k <= 0 else cls(cls.nors[n + k - 1]).mlt(cls.revs[n]).mlt(cls.revs[k - 1]).get_value()

    @classmethod
    def c(cls, n, k):
        return 0 if n - k < 0 else cls(cls.nors[n]).mlt(cls.revs[k]).mlt(cls.revs[n - k]).get_value()

    def get_value(self):
        return self.value

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
        tmp.mlt_value(Modulo.c(p, q))
        tmp.mlt_value(Modulo.pow(2, q))
        tmp.mlt_value(Modulo.h(n - q, q + l))
        ret.add_modulo(tmp)
    return ret.get_value()

def solve():
    k, n = map(int, input().split())
    Modulo.mod = Modulo.mod
    Modulo.build_combination(5000)

    for i in range(2, 2 * k + 1):
        ans = Modulo(0)
        ans.add_value(calc(i, n, k))
        if i % 2 == 0:
            ans.add_value(calc(i, n - 1, k))
        print(ans.get_value())

solve()
```
```
