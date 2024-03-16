Here is the Python version of the given Java code:

```python
import sys
from functools import reduce

def gcd(n, m):
    if m > n:
        return gcd(m, n)
    if m == 0:
        return n
    return gcd(m, n % m)

def lcm(m, n):
    return (m // gcd(m, n)) * n

mod = 1000000007
INF = float('inf')
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
dx8 = [0, 0, 1, -1, 1, 1, -1, -1]
dy8 = [1, -1, 0, 0, 1, -1, -1, 1]

def main():
    a = list(map(int, input().split()))
    a.sort()
    print(abs(a[0] + a[3] - a[1] - a[2]))

class Edge:
    def __init__(self, to, cost):
        self.to = to
        self.cost = cost

    def __lt__(self, other):
        return self.cost < other.cost

class Edge2:
    def __init__(self, from_, to, cost):
        self.from_ = from_
        self.to = to
        self.cost = cost

    def __lt__(self, other):
        return self.cost < other.cost

class RMQ:
    def __init__(self, s):
        self.size_ = 1
        while self.size_ < s:
            self.size_ *= 2
        self.dat = [INF] * (2 * self.size_)

    def update(self, pos, x):
        pos += self.size_
        self.dat[pos] = x
        while pos > 1:
            pos //= 2
            self.dat[pos] = min(self.dat[2 * pos], self.dat[2 * pos + 1])

    def query_(self, a, b, k, l, r):
        if r <= a or b <= l:
            return INF
        if a <= l and r <= b:
            return self.dat[k]
        lc = self.query_(a, b, 2 * k, l, (l + r) // 2)
        rc = self.query_(a, b, 2 * k + 1, (l + r) // 2, r)
        return min(lc, rc)

    def query(self, l, r):
        return self.query_(l, r, 1, 0, self.size_)

size = 2100000
fac = [0] * size
finv = [0] * size
inv = [0] * size

def pow(x, n):
    ans = 1
    while n > 0:
        if n & 1:
            ans = ans * x % mod
        x = x * x % mod
        n >>= 1
    return ans

def div(x, y):
    return x * pow(y, mod - 2) % mod

def init_comb():
    fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1
    for i in range(2, size):
        fac[i] = fac[i - 1] * i % mod
        inv[i] = mod - (mod // i) * inv[mod % i] % mod
        finv[i] = finv[i - 1] * inv[i] % mod

def comb(n, k):
    return fac[n] * finv[k] % mod * finv[n - k] % mod

def fact(n):
    return fac[n]

def finv_(n):
    return finv[n]

if __name__ == '__main__':
    main()
```

Please note that:

1. In Java, the `FastScanner` class is used for fast input, but in Python, this is not needed, as input operations are reasonably fast. Here, I use `input().split()` for simplicity.
2. Java uses explicit typing and class-based structures for everything, while Python uses dynamic typing and functions can be defined and invoked more fluidly.
3. Inheritance and interfaces work differently in Python, so the `Comparable` interface in Java does not have an equivalent in Python. Instead, we use magic methods like `__lt__`, `__le__`, `__eq__`, `__ne__`, `__gt__`, and `__ge__` for ordering.
4. Java's integer division and Python's integer division differ (`/` versus `//`), which needs to be corrected in the translation process.
5. Some of the functionality for classes like `Edge` and `Edge2` wasn't used explicitly in the given main program, so the translation assumes these classes may be utilized in a similar fashion.

Remember to check for off-by-one errors and differences in default values between Java and Python when translating algorithms.

You can run this Python program and provide the input "2 1 3 4" as a single line to get an output of "0", which matches the expected output.
