import sys
from collections import *
from functools import reduce
from math import *

mod = 1000000007

class Combinatrics:
    
    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [0] * N
        self.inv = [0] * N
        self.finv = [0] * N
        self.fact[0], self.fact[1] = 1, 1
        self.finv[0], self.finv[1] = 1, 1
        self.inv[1] = 1
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % mod
            self.inv[i] = mod - self.inv[mod % i] * (mod // i) % mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % mod
    
    def inv(self, n):
        return self.inv[n]
    
    def factorial(self, n):
        return self.fact[n]
    
    def fact_inv(self, n):
        return self.finv[n]
    
    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % mod * self.finv[n - r] % mod)
    
    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[n - r] % mod)
    
    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)

class FastScanner:
    
    def __init__(self):
        self.inp = []
        for line in sys.stdin:
            self.inp.extend(map(int, line.split()))
    
    def next_int(self):
        return self.inp.pop(0)
    
def main():
    sc = FastScanner()
    
    n = sc.next_int()
    k = sc.next_int()
    
    c = Combinatrics(n - 1)
    
    print(c.homogeneous(k, n - k))

if __name__ == "__main__":
    main()