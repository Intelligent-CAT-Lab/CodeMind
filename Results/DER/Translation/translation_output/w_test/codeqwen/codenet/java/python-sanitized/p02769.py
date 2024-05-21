import sys

class ERoaming:
    def __init__(self, n, k, mod=1000000007):
        self.n = n
        self.k = k
        self.mod = mod
        self.fact = [1] * (n + 1)
        self.factinv = [1] * (n + 1)
        self.gen()

    def gen(self):
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1]
            self.fact[i] %= self.mod
            self.factinv[i] = pow(self.fact[i], self.mod - 2, self.mod)

    def solve(self):
        if self.k >= self.n:
            return pow(self.n + self.n - 1, self.n - 1, self.mod)
        else:
            ans = 0
            self.gen()
            for i in range(self.k + 1):
                up = self.fact[self.n] * self.fact[self.n - 1]
                up %= self.mod
                den1 = self.factinv[i] * self.factinv[i]
                den1 %= self.mod
                den2 = self.factinv[self.n - i] * self.factinv[self.n - i - 1]
                den2 %= self.mod
                den = den1 * den2
                den %= self.mod
                ans += up * den
                ans %= self.mod
            return ans

def main():
    n, k = map(int, sys.stdin.readline().split())
    solver = ERoaming(n, k)
    print(solver.solve())

if __name__ == "__main__":
    main()