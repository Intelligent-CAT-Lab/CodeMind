import sys
import math
from functools import cmp_to_key

# Constants
MOD = 1000000007
DX = [0, 0, 1, -1]
DY = [1, -1, 0, 0]
DX8 = [0, 0, 1, -1, 1, 1, -1, -1]
DY8 = [1, -1, 0, 0, 1, -1, -1, 1]
SIZE = 2100000
FAC = [0] * SIZE
FINV = [0] * SIZE

# Function definitions
def gcd(n, m):
    if m > n:
        return gcd(m, n)
    if m == 0:
        return n
    return gcd(m, n % m)

def lcm(m, n):
    return (m // gcd(m, n)) * n

def pow(x, n):
    ans = 1
    while n > 0:
        if n & 1:
            ans = ans * x % MOD
        x = x * x % MOD
        n >>= 1
    return ans

def div(x, y):
    return x * pow(y, MOD - 2) % MOD

def init_comb():
    FAC[0] = FINV[0] = INV[0] = FAC[1] = FINV[1] = INV[1] = 1
    for i in range(2, SIZE):
        FAC[i] = FAC[i - 1] * i % MOD
        INV[i] = MOD - (MOD // i) * INV[MOD % i] % MOD
        FINV[i] = FINV[i - 1] * INV[i] % MOD

def comb(n, k):
    return FAC[n] * FINV[k] % MOD * FINV[n - k] % MOD

def fact(n):
    return FAC[n]

def finv(n):
    return FINV[n]

# Classes
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
        self.dat = [INF] * (self.size_ * 2)
    
    def update(self, pos, x):
        pos += self.size_
        self.dat[pos] = x
        while pos > 1:
            pos //= 2
            self.dat[pos] = min(self.dat[pos * 2], self.dat[pos * 2 + 1])
    
    def query_(self, a, b, k, l, r):
        if r <= a or b <= l:
            return INF
        if a <= l and r <= b:
            return self.dat[k]
        lc = self.query_(a, b, k * 2, l, (l + r) // 2)
        rc = self.query_(a, b, k * 2 + 1, (l + r) // 2, r)
        return min(lc, rc)        
    
    def query(self, l, r):
        return self.query_(l, r, 1, 0, self.size_)

# Read and process input
def main():
    reader = (map(int, line.split()) for line in sys.stdin)
    a = list(next(reader))
    a.sort()
    print(abs(a[0] + a[3] - a[1] - a[2]))

if __name__ == '__main__':
    main()