import sys

def solve(n):
    res = 7
    p2 = 8
    num = 1
    den = 2
    for i in range(1, n):
        res *= 9
        if i > 1:
            inc = p2
            inc *= num
            inc %= mod
            inc *= IntegerUtils.pow((int) den, mod - 2, mod)
            inc %= mod
            res += inc
        res %= mod
        p2 = (p2 * 2) % mod
        num *= 2 * i
        num %= mod
        num *= 2 * i + 1
        num %= mod
        if i > 1:
            den *= i - 1
        den %= mod
        den *= i + 2
        den %= mod
    return res

mod = 998244353
n = int(sys.stdin.readline()) / 2
print(solve(n))