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