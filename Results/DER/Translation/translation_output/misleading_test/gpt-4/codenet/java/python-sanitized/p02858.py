MOD = int(1e9 + 7)

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

def mod_pow(x, n, mod=MOD):
    result = 1
    while n > 0:
        if n % 2 == 1:
            result = (result * x) % mod
        x = (x * x) % mod
        n //= 2
    return result

def solve(h, w, t):
    hh = h // gcd(h, t)
    ww = w // gcd(w, t)

    way = 1
    way = (way + (mod_pow(2, hh) - 2)) % MOD
    way = (way + (mod_pow(2, ww) - 2)) % MOD
    way = (way + mod_pow(2, gcd(hh, ww))) % MOD

    p = (h // hh) * (w // ww) % (MOD - 1)
    way = mod_pow(way, p)
    return way

if __name__ == "__main__":
    h, w, t = map(int, input().split())
    print(solve(h, w, t))