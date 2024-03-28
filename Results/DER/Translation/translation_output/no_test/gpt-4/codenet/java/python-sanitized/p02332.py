import sys
from math import factorial

MOD = 1000000007

class Combinatrics:
    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.inv = [1] * (n + 1)
        self.finv = [1] * (n + 1)
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def factorial(self, n):
        return self.fact[n]

    def fact_inv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n - r] % MOD

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)

def main():
    n, k = map(int, sys.stdin.readline().split())
    c = Combinatrics(k)
    print(c.permutation(k, n))

if __name__ == '__main__':
    main()