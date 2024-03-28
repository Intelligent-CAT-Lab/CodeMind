MOD = 1000000007

def comb(n, r):
    if n < 0 or r < 0 or r > n:
        return 0
    if r > n / 2:
        r = n - r
    res = 1
    for i in range(n, n - r, -1):
        res *= i
    for i in range(1, r + 1):
        res //= i
    return res

def inv(a):
    return pow(