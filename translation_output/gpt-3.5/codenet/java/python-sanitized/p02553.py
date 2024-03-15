import sys

MAX = 200005
MOD = 1000000007

def COMinit():
    fac = [0] * MAX
    finv = [0] * MAX
    inv = [0] * MAX
    fac[0] = fac[1] = 1
    finv[0] = finv[1] = 1
    inv[1] = 1
    for i in range(2, MAX):
        fac[i] = fac[i - 1] * i % MOD
        inv[i] = MOD - inv[MOD % i] * (MOD // i) % MOD
        finv[i] = finv[i - 1] * inv[i] % MOD
    return (fac, finv, inv)

def COM(fac, finv, n, k):
    if n < k:
        return 0
    if n < 0 or k < 0:
        return 0
    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD

def swap(a, b):
    return a if a >= b else b

def modSub(a, b, mod):
    v = a - b
    if v < 0:
        v += mod
    return v % mod

def modDiv(a, b, mod):
    return (a % mod) * modInv(b, mod) % mod

def modInv(a, mod):
    return modPow(a, mod - 2, mod)

def modPow(n, k, mod):
    result = 1
    while k > 0:
        if k & 1:
            result = (result * n) % mod
        n = (n * n) % mod
        k >>= 1
    return result

class UF:
    def __init__(self, n):
        self.par = [-1] * (n + 1)
        self.rank = [0] * (n + 1)

    def root(self, x):
        if self.par[x] < 0:
            return x
        self.par[x] = self.root(self.par[x])
        return self.par[x]

    def unite(self, x, y):
        rx = self.root(x)
        ry = self.root(y)
        if rx == ry:
            return False
        if self.rank[rx] > self.rank[ry]:
            self.par[rx] += self.par[ry]
            self.par[ry] = rx
        else:
            self.par[ry] += self.par[rx]
            self.par[rx] = ry
            if self.rank[rx] == self.rank[ry]:
                self.rank[ry] += 1
        return True

def main():
    fac, finv, inv = COMinit()
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    ans = a * c
    ans = max(ans, a * d)
    ans = max(ans, b * c)
    ans = max(ans, b * d)
    print(ans)

if __name__ == "__main__":
    main()