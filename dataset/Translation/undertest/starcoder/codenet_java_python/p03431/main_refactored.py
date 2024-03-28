class main:
    import sys
    
    mod = 998244353
    
    def comb(n, k):
        if k < 0 or k > n: return 0
        return fact[n] * ifact[k] % mod * ifact[n - k] % mod
    
    def solve(n, k):
        x = getFIF(500010, mod)
        fact = x[0]
        ifact = x[1]
    
        ans = 0
        for diff in range(k % 2, k + 1, 2):
            nr = (k + diff) // 2
            nb = k - nr
            if nr < n: continue
    
            if diff == 0:
                ans += comb(k-1, nr)
                if ans >= mod: ans -= mod
                ans -= comb(k-1, nb-1-(nr-n+1))
                if ans < 0: ans += mod
                continue
    
            r2 = (k - diff) // 2 - min(k - diff, nr - n) - 1
            b2 = k - r2
    
            ans += comb(nr + nb, nb) - comb(r2 + b2, r2)
            ans %= mod
            if ans < 0: ans += mod
    
        return ans
    
    def getFIF(max, mod):
        fact = [1] * max
        ifact = [1] * max
        inv = [0] * max
        inv[1] = 1
        for i in range(2, max):
            inv[i] = (mod - mod // i) * inv[mod % i] % mod
        fact[0] = 1
        ifact[0] = 1
        for i in range(1, max):
            fact[i] = fact[i - 1] * i % mod
            ifact[i] = ifact[i - 1] * inv[i] % mod
        return fact, ifact, inv
    
    def main():
        input = sys.stdin.readline
        n, k = map(int, input().split())
        print(solve(n, k))
    
    if __name__ == '__main__':
        main()