import math
import sys

MOD = 1000000007

class Combinatrics:
    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [1] * N
        self.inv = [1] * N
        self.finv = [1] * N
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD
    
    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def iteration_pow(self, x, n):
        result = 1
        while n > 0:
            if n & 1:
                result = result * x % MOD
            x = x * x % MOD
            n >>= 1
        return result
    
    def surjection(self, n, k):
        ans = 0
        sign = -1 if k % 2 == 0 else 1
        for i in range(1, k + 1):
            if sign == 1:
                ans += self.combination(k, i) * self.iteration_pow(i, n)
                ans %= MOD
            else:
                ans -= self.combination(k, i) * self.iteration_pow(i, n)
                ans %= MOD
            sign *= -1
        return self.mod(ans)
    
    def stirling(self, n, k):
        return self.surjection(n, k) * self.finv[k] % MOD
    
    def bell(self, n, k):
        ans = 0
        for i in range(1, k + 1):
            ans += self.stirling(n, i)
            ans %= MOD
        return ans
    
    def mod(self, a):
        return (a % MOD + MOD) % MOD

def main():
    # Assuming input comes from standard input and is formatted correctly
    n, k = map(int, input().split())

    c = Combinatrics(k)
    print(c.bell(n, k))

if __name__ == "__main__":
    main()