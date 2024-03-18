import sys
import math

def gcd(n, m):
    return math.gcd(n, m)
    
def lcm(m, n):
    return (m // gcd(m, n)) * n

MOD = 1000000007
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
    def __init__(self, frm, to, cost):
        self.frm = frm
        self.to = to
        self.cost = cost
        
    def __lt__(self, other):
        return self.cost < other.cost
        

class RMQ:
    def __init__(self, s):
        self.size = 1
        while self.size < s:
            self.size *= 2
        self.dat = [INF] * (self.size * 2)
        
    def update(self, pos, x):
        pos += self.size
        self.dat[pos] = x
        pos //= 2
        while pos:
            self.dat[pos] = min(self.dat[2 * pos], self.dat[2 * pos + 1])
            pos //= 2
            
    def query(self, l, r):
        return self._query(l, r, 1, 0, self.size)
        
    def _query(self, a, b, k, l, r):
        if r <= a or b <= l:
            return INF
        if a <= l and r <= b:
            return self.dat[k]
        lc = self._query(a, b, k * 2, l, (l + r) // 2)
        rc = self._query(a, b, k * 2 + 1, (l + r) // 2, r)
        return min(lc, rc)


size = 2100000
fac = [0] * size
finv = [0] * size
inv = [0] * size

def pow(x, n):
    ans = 1
    while n:
        if n & 1:
            ans = ans * x % MOD
        x = x * x % MOD
        n >>= 1
    return ans

def div(x, y):
    return (x * pow(y, MOD-2)) % MOD
    
def init_comb():
    fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1
    for i in range(2, size):
        fac[i] = fac[i-1] * i % MOD
        inv[i] = MOD - (MOD // i) * inv[MOD % i] % MOD
        finv[i] = finv[i-1] * inv[i] % MOD

def comb(n, k):
    if n < 0 or k < 0 or n < k:
        return 0
    return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD

def fact(n):
    return fac[n]

def finv(n):
    return finv[n]


if __name__ == "__main__":
    main()