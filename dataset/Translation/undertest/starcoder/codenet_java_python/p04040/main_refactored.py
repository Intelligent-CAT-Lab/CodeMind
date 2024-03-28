class main:
    import sys
    
    def modExp(x, y, mod):
        if y == 0:
            return 1 % mod
        ret = modExp(x, y >> 1, mod)
        ret = ret * ret % mod
        if (y & 1) == 1:
            ret = ret * (x % mod) % mod
        return ret
    
    def fact(n, mod):
        fact = [1] * (n + 1)
        ifact = [1] * (n + 1)
        fact[0] = 1
        ifact[0] = 1
        for i in range(1, n + 1):
            fact[i] = fact[i - 1] * i % mod
            ifact[i] = ifact[i - 1] * modExp(i, mod - 2, mod) % mod
        return fact, ifact
    
    def solve(r, c, a, b):
        mod = 1000000007
        fact, ifact = fact(r + c, mod)
        res = fact[r - 1 + c - 1] * ifact[r - 1] % mod * ifact[c - 1] % mod
        sub = 0
        for x in range(b):
            v1 = fact[r - a - 1 + x] * ifact[r - a - 1] % mod * ifact[x] % mod
            v2 = fact[a - 1 + c - 1 - x] * ifact[a - 1] % mod * ifact[c - 1 - x] % mod
            sub = (sub + v1 * v2 % mod) % mod
        res = (res - sub + mod) % mod
        print(res)
    
    def main():
        r, c, a, b = map(int, sys.stdin.readline().split())
        solve(r, c, a, b)
    
    if __name__ == '__main__':
        main()