import math
from sys import stdin

MOD = 1000000007

def modinv(x, p):
    return pow(x, p - 2, p)

class ERoaming:
    def gen(self, n):
        self.fact = [0] * (n + 1)
        self.factinv = [0] * (n + 1)
        self.fact[0] = 1
        self.factinv[0] = modinv(self.fact[0], MOD)
        for i in range(1, n + 1):
            self.fact[i] = i * self.fact[i - 1] % MOD
            self.factinv[i] = modinv(self.fact[i], MOD)

    def solve(self, n, k):
        if k >= n:
            return self.nCrs(2 * n - 1, n - 1, MOD)
        else:
            ans = 0
            self.gen(n)
            for i in range(k + 1):
                up = self.fact[n] * self.fact[n - 1] % MOD
                den1 = self.factinv[i] * self.factinv[i] % MOD
                den2 = self.factinv[n - i] * self.factinv[n - i - 1] % MOD
                den = den1 * den2 % MOD
                ans = (ans + up * den) % MOD
            return ans

    def nCrs(self, n, r, p):
        up = 1
        down = 1
        for i in range(r + 1, n + 1):
            up = up * i % p
        for i in range(1, r + 1):
            down = down * i % p
        return up * modinv(down, p) % p


def main():
    inputs = stdin.readline().strip().split()
    n = int(inputs[0])
    k = int(inputs[1])
    solver = ERoaming()
    print(solver.solve(n, k))


if __name__ == "__main__":
    main()