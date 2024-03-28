import sys
from functools import reduce

MOD = 1000000007

class Combinatrics:
    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [1] * N
        self.inv = [1] * N
        self.finv = [1] * N
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i-1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD%i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i-1] * self.inv[i] % MOD

    def inv(self, n):
        return self.inv[n]

    def factorial(self, n):
        return self.fact[n]

    def fact_inv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % MOD * self.finv[n-r] % MOD

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n-r] % MOD

    def homogeneous(self, n, r):
        return self.combination(n+r-1, r)

    def surjection(self, n, k):
        ans = 0
        sign = -1 if k % 2 == 0 else 1
        for i in range(1, k+1):
            term = self.combination(k, i) * self.iteration_pow(i, n) % MOD
            ans = (ans + sign * term) % MOD
            sign *= -1
        ans = self.mod(ans)
        return ans

    def iteration_pow(self, x, n):
        result = 1
        while n > 0:
            if n & 1:
                result = result * x % MOD
            x = x * x % MOD
            n >>= 1
        return result

    def mod(self, a):
        return (a % MOD + MOD) % MOD


def main():
    n, k = map(int, sys.stdin.readline().split())
    c = Combinatrics(k)
    print(c.surjection(n, k))


if __name__ == "__main__":
    try:
        original_stdin = sys.stdin
        sys.stdin = open('/dev/stdin', 'r')
    except FileNotFoundError:
        pass  # Ignore, as it's likely being run locally or not in Linux environment
    main()