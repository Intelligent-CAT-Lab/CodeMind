MOD = 1000000007

class Combinatorics:
    def __init__(self, n):
        self.fact = [0] * (n + 1)
        self.inv = [0] * (n + 1)
        self.finv = [0] * (n + 1)
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD
    
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
    n, k = map(int, input().split())
    comb = Combinatorics(k)
    print(comb.combination(k, n))

if __name__ == "__main__":
    # It is typical in Python to just call the `main` function
    # as Python scripts don't require a special thread with a specific stack size.
    main()