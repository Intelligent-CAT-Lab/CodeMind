import sys

class TaskE:
    mod = 998244353
    
    def __init__(self):
        self.n = 0
        self.k = 0
        self.fact = []
        self.ifact = []
    
    def comb(self, n, k):
        if k < 0 or k > n:
            return 0
        return self.fact[n] * self.ifact[k] % self.mod * self.ifact[n - k] % self.mod
    
    def solve(self, in_data):
        self.n, self.k = map(int, in_data.split())
        
        x = Factorials.get_fif(500010, self.mod)
        self.fact = x[0]
        self.ifact = x[1]
        
        ans = 0
        for diff in range(self.k % 2, self.k + 1, 2):
            nr = (self.k + diff) // 2
            nb = self.k - nr
            if nr < self.n:
                continue
            
            if diff == 0:
                ans += self.comb(self.k-1, nr)
                if ans >= self.mod:
                    ans -= self.mod
                ans -= self.comb(self.k-1, nb-1-(nr-self.n+1))
                if ans < 0:
                    ans += self.mod
                continue
            
            r2 = (self.k - diff) // 2 - min(self.k - diff, nr - self.n) - 1
            b2 = self.k - r2
            
            ans += self.comb(nr + nb, nb) - self.comb(r2 + b2, r2)
            ans %= self.mod
            if ans < 0:
                ans += self.mod
        
        return str(ans)


class Factorials:
    @staticmethod
    def get_fif(max_val, mod):
        fact = [0]*max_val
        ifact = [0]*max_val
        inv = [0]*max_val
        inv[1] = 1
        for i in range(2, max_val):
            inv[i] = (mod - mod // i) * inv[mod % i] % mod
        fact[0] = 1
        ifact[0] = 1
        for i in range(1, max_val):
            fact[i] = fact[i - 1] * i % mod
            ifact[i] = ifact[i - 1] * inv[i] % mod
        return [fact, ifact, inv]


def main():
    task = TaskE()
    in_data = sys.stdin.readline().strip()
    result = task.solve(in_data)
    print(result)


if __name__ == "__main__":
    main()