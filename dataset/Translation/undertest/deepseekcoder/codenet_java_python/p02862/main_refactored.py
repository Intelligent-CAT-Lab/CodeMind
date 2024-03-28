class main:
    import sys
    import io
    import math
    
    mod = 1_000_000_007
    inf = sys.maxsize // 2
    
    def solve(x, y):
        if ((2*y-x)%3 != 0 or 2*y-x < 0):
            return 0
        a = (2*y-x) // 3
        if ((2*x-y)%3 != 0 or 2*x-y < 0):
            return 0
        b = (2*x-y) // 3
        fif = enumFIF(3000000, mod)
        return C(a+b, a, mod, fif)
    
    def C(n, r, mod, fif):
        if n < 0 or r < 0 or r > n:
            return 0
        return (fif[0][n] * fif[1][r] % mod) * fif[1][n - r] % mod
    
    def enumFIF(n, mod):
        f = [0] * (n + 1)
        invf = [0] * (n + 1)
        f[0] = 1
        for i in range(1, n + 1):
            f[i] =