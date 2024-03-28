class main:
    import sys
    
    def solve():
        n = int(input())
        mod = 1000000007
        total = pow(10, n, mod)
        partial = 2 * pow(9, n, mod)
        both = pow(8, n, mod)
        ans = (total - partial + both) % mod
        ans = (ans + mod) % mod
        print(ans)
    
    def modpow(a, n, mod):
        res = 1
        while n > 0:
            if n & 1 == 1:
                res = res * a % mod
            a = a * a % mod
            n >>= 1
        return res
    
    if __name__ == "__main__":
        S = time.time()
        is = sys.stdin
        out = sys.stdout
    
        solve()
        out.flush()
        G = time.time()
        print(f"{G-S:.3f}s")