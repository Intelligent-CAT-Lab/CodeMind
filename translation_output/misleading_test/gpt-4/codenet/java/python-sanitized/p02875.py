# Test input:
n = int(input().strip())
n = n // 2
MOD = 998244353

# Helper function for modular exponentiation
def pow_mod(x, y, mod):
    x %= mod
    res = 1
    while y > 0:
        if y % 2 == 1:
            res = (res * x) % mod
            y -= 1
        else:
            x = (x * x) % mod
            y //= 2
    return res % mod

# Main logic
res = 7
p2 = 8
num = 1
den = 2
for i in range(1, n):
    res *= 9
    res %= MOD
    if i > 1:
        inc = p2 * num * pow_mod(den, MOD - 2, MOD)
        inc %= MOD
        res += inc
        res %= MOD
    p2 = p2 * 2 % MOD
    num = num * (2 * i) % MOD * (2 * i + 1) % MOD
    if i > 1:
        den = den * (i - 1) % MOD
    den = den * (i + 2) % MOD

print(res)