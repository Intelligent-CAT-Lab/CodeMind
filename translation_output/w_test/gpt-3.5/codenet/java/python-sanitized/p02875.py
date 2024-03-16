import sys
from collections import defaultdict
def pow(x, y, mod):
    x %= mod
    res = 1
    while y > 0:
        if y % 2 == 1:
            y -= 1
            res = (res * x) % mod
        else:
            y //= 2
            x = (x * x) % mod
    return res

def solve():
    mod = 998244353
    n = int(input()) // 2
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
            inc *= pow(den, mod - 2, mod)
            inc %= mod
            res += inc
        res %= mod
        p2 = (p2 * 2) % mod
        k = i
        num *= 2 * k
        num %= mod
        num *= 2 * k + 1
        num %= mod
        if k > 1:
            den *= k - 1
        den %= mod
        den *= k + 2
        den %= mod
    print(res)

solve()