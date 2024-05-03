import sys

class p02334:
    def __init__(self):
        self.main()

    def main(self):
        self.run()

    def run(self):
        sc = FastScanner()

        n = sc.nextInt()
        k = sc.nextInt()

        c = Combinatrics(n + k - 1)

        print(c.homogeneous(k, n))


class Combinatrics:
    mod = 1000000007  # éåãåãã®ã§ç´ æ°åæ
    fact = [1] * (n + k + 1)  # éä¹ã®ãã¼ãã«
    inv = [1] * (n + k + 1)  # éåã®ãã¼ãã«
    finv = [1] * (n + k + 1)  # éä¹ã®éåã®ãã¼ãã«

    def __init__(self, n):
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.mod

    # éå
    def inv(self, n):
        return self.inv[n]

    # n!
    def factorial(self, n):
        return self.fact[n]

    # n!ã®éå
    def factInv(self, n):
        return self.finv[n]

    # nCrï¼nåããåé¸ã¶ï¼
    def combination