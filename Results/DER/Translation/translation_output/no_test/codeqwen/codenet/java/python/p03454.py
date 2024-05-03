```python
import sys
import math

MOD = 1000000007

def solve():
    S = int(input())

    ans = 0
    for midl in range(2, 9):
        for midr in range(midl, 9):
            mid = 0
            for i in range(midr):
                mid += 9 * (10 ** (midr - 1))
                if mid >= S:
                    break

            rem = S - mid
            l = midl - 1
            r = midr + 1
            lnum = 9 * (10 ** (l - 1))
            rnum = 9 * (10 ** (r - 1))

            ans += count(l, r, rem, lnum, rnum)
            ans %= MOD

    for l in range(1, 10001):
        ans += count(l, l + 1, S, lnum, rnum)
        ans %= MOD

    for k in range(1, int(math.sqrt(S)) + 1):
        if S % k == 0:
            ans += count(k, S // k, S, lnum, rnum)
            ans %= MOD

    for d in range(1, int(math.sqrt(S)) + 1):
        if S % d == 0:
            ans += count(d, S // d, S, lnum, rnum)
            ans %= MOD

    print(ans % MOD)


def count(l, r, rem, lnum, rnum):
    if r - l > 1:
        gcd_l, a, b = exgcd(l, r)
        if rem % gcd_l != 0:
            return 0
        a = a * (rem // gcd_l)
        b = b * (rem // gcd_l)
        da = r // gcd_l
        db = l // gcd_l
    else:
        a = -rem
        b = rem
        da = r
        db = l

    min_a = a
    max_a = a

    if b <= 0
