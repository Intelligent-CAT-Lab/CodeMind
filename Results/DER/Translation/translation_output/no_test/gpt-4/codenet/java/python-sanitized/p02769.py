import sys
from math import factorial as fact
from functools import lru_cache

# Helper function to compute power with modulo (pow with mod)
def power(x, y, p):
    res = 1
    x = x % p
    while y > 0:
        if y & 1:
            res = (res * x) % p
        y >>= 1
        x = (x * x) % p
    return res

# Helper function to compute nCrs with modulo
def nCrs(n, r, p):
    # r is small
    up = 1
    down = 1
    for i in range(n - r + 1, n + 1):
        up = (up * i) % p
    for i in range(1, r + 1):
        down = (down * i) % p
    return (up * power(down, p - 2, p)) % p

@lru_cache(maxsize=None)
def factmod(n, p):
    return 1 if n == 0 else (n * factmod(n - 1, p)) % p

@lru_cache(maxsize=None)
def factinvmod(n, p):
    return power(factmod(n, p), p - 2, p)

class ERoaming:
    def __init__(self, stream_input=True):
        self.fact = []
        self.factinv = []
        self.mod = 1000000007
        self.n = 0
        
        if stream_input:
            self.n = next_int()
            self.k = next_int()

    def gen(self):
        self.fact = [0] * (int(self.n) + 1)
        self.factinv = [0] * (int(self.n) + 1)
        self.fact[0] = 1
        self.factinv[0] = factinvmod(self.fact[0], self.mod)
        for i in range(1, int(self.n) + 1):
            self.fact[i] = factmod(i, self.mod) * self.fact[i - 1]
            self.fact[i] %= self.mod
            self.factinv[i] = factinvmod(self.fact[i], self.mod)

    def solve(self):
        ans = 0
        self.gen()

        if self.k >= self.n:
            return nCrs(self.n + self.n - 1, self.n - 1, self.mod)
        else:
            for i in range(int(self.k) + 1):
                up = self.fact[int(self.n)] * self.fact[int(self.n) - 1]
                up %= self.mod
                den1 = self.factinv[i] * self.factinv[i]
                den1 %= self.mod
                den2 = self.factinv[int(self.n) - i] * self.factinv[int(self.n) - i - 1]
                den2 %= self.mod
                den = den1 * den2
                den %= self.mod
                ans += up * den
                ans %= self.mod
            return ans

# Custom input reader
def next_token():
    for tok in sys.stdin.buffer.read().split():
        yield tok.decode()
_next_token_gen = next_token()

def next_int():
    global _next_token_gen
    return int(next(_next_token_gen))

if __name__ == "__main__":
    solver = ERoaming()
    result = solver.solve()
    print(result)