import math
import sys

# Since there is no direct equivalent in Python for Java's threading,
# we will implement the functionality in a function and call it directly.


class Combinatrics:
    MOD = 1000000007
    
    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [1] * N
        self.inv = [1] * N
        self.finv = [1] * N
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % self.MOD
            self.inv[i] = self.MOD - self.inv[self.MOD % i] * (self.MOD // i) % self.MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.MOD
            
    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % self.MOD * self.finv[n - r] % self.MOD
        
    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n - r] % self.MOD
        
    def stirling(self, n, k):
        surj = self.surjection(n, k)
        return surj * self.finv[k] % self.MOD
        
    def surjection(self, n, k):
        ans = 0
        sign = 1 if k % 2 == 0 else -1
        for i in range(1, k + 1):
            comb = self.combination(k, i)
            ipow = pow(i, n, self.MOD)
            ans = (ans + sign * comb * ipow) % self.MOD
            sign *= -1
        return (ans + self.MOD) % self.MOD
        
    def bell(self, n, k):
        ans = 0
        for i in range(1, k + 1):
            ans = (ans + self.stirling(n, i)) % self.MOD
        return ans


def main():
    n, k = map(int, sys.stdin.readline().split())
    c = Combinatrics(k)
    print(c.bell(n, k))


if __name__ == "__main__":
    main()