class main:
    import sys
    import math
    
    MOD = 1_000_000_007
    
    
    def main():
        x, y = map(int, sys.stdin.readline().split())
        if (2 * y - x) % 3 != 0 or (2 * y - x) < 0:
            print(0)
            return
        a = (2 * y - x) // 3
        if (2 * x - y) % 3 != 0 or (2 * x - y) < 0:
            print(0)
            return
        b = (2 * x - y) // 3
        fif = enum_fif(3000000, MOD)
        print(C(a + b, a, MOD, fif))
    
    
    def C(n, r, mod, fif):
        if n < 0 or r < 0 or r > n:
            return 0
        return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod
    
    
    def enum_fif(n, mod):
        f = [0] * (n + 1)
        invf = [0] * (n + 1)
        f[0] = 1
        for i in range(1, n + 1):
            f[i] = f[i - 1] * i % mod
    
        a = f[n]
        b = mod
        p = 1
        q = 0
        while b > 0:
            c = a // b
            a, b = b, a % b
            p, q = q, p - c * q
    
        invf[n] = p + mod if p < 0 else p
        for i in range(n - 1, -1, -1):
            invf[i] = invf[i + 1] * (i + 1) % mod
    
        return [f, invf]
    
    
    if __name__ == "__main__":
        main()