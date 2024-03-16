import sys

mod = 1000000007

class Combinatrics:
    def __init__(self, n):
        self.fact = [0] * (n+1)
        self.inv = [0] * (n+1)
        self.finv = [0] * (n+1)
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n+1):
            self.fact[i] = self.fact[i-1] * i % mod
            self.inv[i] = mod - self.inv[mod%i] * (mod // i) % mod
            self.finv[i] = self.finv[i