import math

def solve(S):
    mod = 1000000007
    ans = 0

    for midl in range(2, 9):
        mid = 0
        for midr in range(midl, 9):
            mid += int(math.pow(10, midr - 1)) * 9 * midr
            if mid >= S:
                break

            rem = S - mid
            l, r = midl - 1, midr + 1
            lnum = int(math.pow(10, l - 1)) * 9
            rnum = int(math.pow(10, r - 1)) * 9

            res = count(l, r, rem, lnum, rnum)
            ans += res
            ans %= mod

    for l in range(1, 10001):
        lnum = int(math.pow(10, l - 1)) * 9 if l <= 10 else math.inf
        rnum = int(math.pow(10, l)) * 9 if l + 1 <= 10 else math.inf
        ans += count(l, l + 1, S, lnum, rnum)
        ans %= mod

    for k in range(1, S // 10000 + 1):
        l = S // k
        lnum = int(math.pow(10, l - 1)) * 9 if l <= 10 else math.inf
        rnum = int(math.pow(10, l)) * 9 if l + 1 <= 10 else math.inf
        ans += count(l, l + 1, S, lnum, rnum)
        ans %= mod

    for d in range(1, int(math.sqrt(S)) + 1):
        if S % d == 0:
            lnum = int(math.pow(10, d - 1)) * 9 if d <= 10 else math.inf
            if S // d <= lnum:
                ans += (pow(10, d - 1, mod) * 9 - S // d + mod + 1)
                ans %= mod
            if d * d < S:
                lnum = int(math.pow(10, S // d - 1)) * 9 if S // d <= 10 else math.inf
                if d <= lnum:
                    ans += (pow(10, S // d - 1, mod) * 9 - d + mod + 1)
                    ans %= mod

    return ans % mod


def pow(a, n, mod):
    ret = 1
    x = 63 - n.bit_length()
    for _ in range(x + 1):
        ret = (ret * ret) % mod
        if n & (1 << x):
            ret = (ret * a) % mod
        x -= 1
    return ret


def count(l, r, rem, lnum, rnum):
    if r - l > 1:
        gpr = exgcd(l, r)
        if rem % gpr[0] != 0:
            return 0
        a = gpr[1] * (rem // gpr[0])
        b = gpr[2] * (rem // gpr[0])
        da = r // gpr[0]
        db = l // gpr[0]
    else:
        a = -rem
        b = rem
        da = r
        db = l

    if a <= 0:
        need = (-a // da) + 1
        a += need * da
        b -= need * db

    while a > 1 and a % da == 0:
        a -= da
        b += db

    if b > rnum:
        need = (b - rnum) // db + 1
        b -= need * db
        a += need * da

    mina = a

    if b <= 0:
        need = (-b // db) + 1
        b += need * db
        a -= need * da

    while b > 1 and b % db == 0:
        b -= db
        a += da

    if a > lnum:
        need = (a - lnum) // da + 1
        a -= need * da
        b += need * db

    maxa = a
    ret = max(0, (maxa - mina) // da + 1)
    return ret


def exgcd(a, b):
    if a == 0 or b == 0:
        return None
    as_ = math.copysign(1, a)
    bs = math.copysign(1, b)
    a, b = abs(a), abs(b)
    p, q, r, s = 1, 0, 0, 1
    while b > 0:
        c = a // b
        a, b = b, a % b
        p, q = q, p - c * q
        r, s = s, r - c * s
    return a, int(p * as_), int(r * bs)

# Sample test case
S = int(input())
print(solve(S))