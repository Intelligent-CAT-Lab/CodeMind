class main:
    import sys
    
    def mod_pow(a, p, m):
        if a == 1: return 1
        ans = 1
        while p > 0:
            if p % 2 == 1: ans = (ans * a) % m
            a = (a * a) % m
            p >>= 1
        return ans
    
    def mod_inv(a, m):
        return mod_pow(a, m - 2, m)
    
    def NcR(n, r):
        if r > n or r < 0: return 0
        if r == 0: return 1
        if r == 1: return n
        if r == n: return 1
        return (NcR(n - 1, r) * n) % 1000000007
    
    def main():
        input = sys.stdin.readline
        MOD = 1000000007
        n, m, k = map(int, input().split())
        ans = 0
        fact = [1] * (n + 1)
        ifact = [1] * (n + 1)
        fact[0] = fact[1] = ifact[0] = ifact[1] = 1
        for i in range(1, n + 1):
            fact[i] = (fact[i - 1] * i) % MOD
            ifact[i] = mod_inv(fact[i], MOD)
        for i in range(k + 1):
            ans = (ans + m * (mod_pow(m - 1, n - (i + 1), MOD) * NcR(n - 1, i)) % MOD) % MOD
        print(ans)
    
    if __name__ == '__main__':
        main()