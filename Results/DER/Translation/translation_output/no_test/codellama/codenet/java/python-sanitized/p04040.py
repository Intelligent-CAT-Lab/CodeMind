import sys

def solve(r, c, a, b):
    mod = 1000000007
    fact = [1] * (r + c)
    ifact = [1] * (r + c)
    fact[0] = 1
    ifact[0] = 1
    for i in range(1, r + c):
        fact[i] = fact[i - 1] * i % mod
        ifact[i] = ifact[i - 1] * mod_exp(i, mod - 2, mod) % mod
    res = fact[r - 1 + c - 1] * ifact[r - 1] % mod * ifact[c - 1] % mod
    sub = 0
    for x in range(b):
        v1 = fact[r - a - 1 + x] * ifact[r - a - 1] % mod * ifact[x] % mod
        v2 = fact[a - 1 + c - 1 - x] * ifact[a - 1] % mod * ifact[c - 1 - x] % mod
        sub = (sub + v1 * v2 % mod) % mod
    res = (res - sub + mod) % mod
    return res

def mod_exp(x, y, mod):
    if y == 0:
        return 1 % mod
    ret = mod_exp(x, y >> 1, mod)
    ret = ret * ret % mod
    if (y & 1) == 1:
        ret = ret * (x % mod) % mod
    return ret

if __name__ == "__main__":
    r, c, a, b = map(int, sys.stdin.readline().split())
    print(solve(r, c, a, b))