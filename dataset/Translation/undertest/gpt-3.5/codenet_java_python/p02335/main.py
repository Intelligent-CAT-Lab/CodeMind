class Combinatrics:

    mod = 1000000007
    fact = None
    inv = None
    finv = None

    def __init__(self, n):
        self.fact = [0] * (n + 1)
        self.inv = [0] * (n + 1)
        self.finv = [0] * (n + 1)
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n + 1):
            self.fact[i] = (self.fact[i - 1] * i) % self.mod
            self.inv[i] = (self.mod - self.inv[self.mod % i] * (self.mod // i)) % self.mod
            self.finv[i] = (self.finv[i - 1] * self.inv[i]) % self.mod

    def inv(self, n):
        return self.inv[n]

    def factorial(self, n):
        return self.fact[n]

    def fact_inv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[r] % self.mod * self.finv[n - r] % self.mod)

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[n - r] % self.mod)

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)


class FastScanner:

    def nextInt(self):
        return int(input())

if __name__ == "__main__":
    n, k = map(int, input().split())
    c = Combinatrics(k)
    print(c.combination(k, n))