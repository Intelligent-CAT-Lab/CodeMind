class main:
    import sys
    
    mod = 1000000007
    
    def power(x, y, p):
        res = 1
        x = x % p
        while (y > 0):
            if ((y & 1) == 1):
                res = (res * x) % p
            y = y >> 1
            x = (x * x) % p
        return res
    
    def nCrs(n, r, p):
        num = 1
        for i in range(int(n - r + 1), int(n + 1)):
            num = (num * i) % p
        den = 1
        for i in range(1, int(r + 1)):
            den = (den * i) % p
        return (num * power(den, p - 2, p)) % p
    
    def solve(n, k):
        if (k >= n):
            return nCrs(n + n - 1, n - 1, mod)
        else:
            ans = 0
            for i in range(int(k + 1)):
                up = n * (n - 1)
                den1 = power(i, mod - 2, mod)
                den2 = power(n - i, mod - 2, mod)
                den = (den1 * den2) % mod
                ans = (ans + up * den) % mod
            return ans
    
    n, k = map(int, sys.stdin.readline().split())
    print(solve(n, k))