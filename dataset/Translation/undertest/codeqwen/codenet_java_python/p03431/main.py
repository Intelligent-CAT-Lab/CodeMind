import sys

class Factorials:
    @staticmethod
    def getFIF(max, mod):
        fact = [1] * max
        ifact = [1] * max
        inv = [1] * max
        inv[1] = 1
        for i in range(2, max):
            inv[i] = (mod - mod // i) * inv[mod % i] % mod
        fact[0] = 1
        ifact[0] = 1
        for i in range(1, max):
            fact[i] = fact[i - 1] * i % mod
            ifact[i] = ifact[i - 1] * inv[i] % mod
        return fact, ifact, inv

class TaskE:
    mod = 998244353
    def comb(self, n, k):
        if k < 0 or k > n: return 0
        return self.fact[n] * self.ifact[k] % self.mod * self.ifact[n - k] % self.mod

    def solve(self, testNumber, inp, out):
        self.n = inp.nextInt()
        self.k = inp.nextInt()
        x = Factorials.getFIF(500010, self.mod)
        self.fact = x[0]
        self.ifact = x[1]

        ans = 0
        for diff in range(k % 2, k + 1, 2):
            nr = (k + diff) // 2
            nb = k - nr
            if nr < self.n: continue

            if diff == 0:
                ans += self.comb(k-1, nr)
                if ans >= self.mod: ans -= self.mod
                ans -= self.comb(k-1, nb-1-(nr-self.n+1))
                if ans < 0: ans += self.mod
                continue

            r2 = (k - diff) // 2 - min(k - diff, nr - self.n) - 1
            b2 = k - r2