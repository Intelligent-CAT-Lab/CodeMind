class main:
    import sys
    import math
    
    MOD = 10**9 + 7
    
    
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a
    
    
    def pow_mod(x, n, mod):
        result = 1
        x %= mod
        while n > 0:
            if n % 2:
                result = result * x % mod
            x = x * x % mod
            n //= 2
        return result
    
    
    def main():
        h, w, t = map(int, sys.stdin.readline().split())
    
        hh = h // gcd(h, t)
        ww = w // gcd(w, t)
    
        way = 1
        way = (way + pow_mod(2, hh, MOD) - 2) % MOD
        way = (way + pow_mod(2, ww, MOD) - 2) % MOD
        way = (way + pow_mod(2, gcd(hh, ww), MOD)) % MOD
    
        p = (h // hh) * (w // ww) % (MOD - 1)
        way = pow_mod(way, p, MOD)
        
        print(way)
    
    
    if __name__ == "__main__":
        main()