class Factorials:
    @staticmethod
    def get_fif(max_val, mod):
        fact = [0] * max_val
        ifact = [0] * max_val
        inv = [0] * max_val
        inv[1] = 1
        for i in range(2, max_val):
            inv[i] = (mod - mod // i) * inv[mod % i] % mod
        fact[0] = ifact[0] = 1
        for i in range(1, max_val):
            fact[i] = fact[i - 1] * i % mod
            ifact[i] = ifact[i - 1] * inv[i] % mod
        return fact, ifact, inv


class TaskE:
    mod = 998244353

    def __init__(self):
        self.n = 0
        self.k = 0
        self.fact = None
        self.ifact = None

    def comb(self, n, k):
        if k < 0 or k > n:
            return 0
        return self.fact[n] * self.ifact[k] % self.mod * self.ifact[n - k] % self.mod

    def solve(self):
        self.n, self.k = map(int, input().split())
        self.fact, self.ifact, _ = Factorials.get_fif(500010, self.mod)

        ans = 0
        for diff in range(self.k % 2, self.k + 1, 2):
            nr = (self.k + diff) // 2
            nb = self.k - nr
            if nr < self.n:
                continue

            if diff == 0:
                ans += self.comb(self.k - 1, nr)
                if ans >= self.mod:
                    ans -= self.mod
                ans -= self.comb(self.k - 1, nb - 1 - (nr - self.n + 1))
                if ans < 0:
                    ans += self.mod
                continue

            r2 = (self.k - diff) // 2 - min(self.k - diff, nr - self.n) - 1
            b2 = self.k - r2

            ans += self.comb(nr + nb, nb) - self.comb(r2 + b2, r2)
            ans %= self.mod
            if ans < 0:
                ans += self.mod

        print(ans)


if __name__ == "__main__":
    TaskE().solve()