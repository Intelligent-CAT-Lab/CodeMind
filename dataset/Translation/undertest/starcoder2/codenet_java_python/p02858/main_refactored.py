class main:
    import sys
    
    def gcd(a, b):
        if a >= b:
            return gcd0(a, b)
        else:
            return gcd0(b, a)
    
    def gcd0(a, b):
        if b == 0:
            return a
        else:
            return gcd0(b, a % b)
    
    def pow(x, n, mod):
        if n == 0:
            return 1
        r = pow(x, n >> 1, mod)
        r = (r * r) % mod
        if (n & 1) == 1:
            r = (r * x) % mod
        return r
    
    def solve(h, w, t):
        hh = h // gcd(h, t)
        ww = w // gcd(w, t)
        mod = 1000000007
        way = 1
        way = (way + pow(2, hh, mod) - 2) % mod
        way = (way + pow(2, ww, mod) - 2) % mod
        way = (way + pow(2, gcd(hh, ww), mod)) % mod
        p = (h // hh) * (w // ww)
        way = pow(way, p, mod)
        return way
    
    h, w, t = map(int, input().split())
    print(solve(h, w, t