def pow_mod(a, n, mod):
    ret = 1
    while n > 0:
        if n & 1:
            ret = ret * a % mod
        a = a * a % mod
        n >>= 1
    return ret

def exgcd(a, b):
    if a == 0 or b == 0:
        return None
    p, q, r, s = 1, 0, 0, 1
    while b > 0:
        c, d = divmod(a, b)
        a, b = b, d
        p, q, r, s = q, p - c * q, s, r - c * s
    return a, p, r

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

    while a <= 0:
        need = -a // da + 1
        a += need * da
        b -= need * db
    while a > 1:
        need = (a - 1) // da
        a -= need * da
        b += need * db

    if b > rnum:
        need = (b - (rnum + 1)) // db + 1
        b -= need * db
        a += need * da

    mina = a

    while b <= 0:
        need = -b // db + 1
        b += need * db
        a -= need * da

    while b > 1:
        need = (b - 1) // db
        b -= need * db
        a += need * da

    if a > lnum:
        need = (a - (lnum + 1)) // da + 1
        a -= need * da
        b += need * db

    maxa = a
    ret = 0 if mina > maxa else (maxa - mina) // da + 1
    return ret

def solve(S):
    mod = 1000000007
    ans = 0
    for midl in range(2, 9):
        mid = 0
        for midr in range(midl, 9):
            mid += 10 ** (midr - 1) * 9 * midr
            if mid >= S:
                break

            rem = S - mid
            l = midl - 1
            r = midr + 1
            lnum = 10 ** (l - 1) * 9 if l <= 10 else float('inf')
            rnum = 10 ** (r - 1) * 9 if r <= 10 else float('inf')
            res = count(l, r, rem, lnum, rnum)
            ans = (ans + res) % mod

    for l in range(1, 10001):
        lnum = 10 ** (l - 1) * 9 if l <= 10 else float('inf')
        rnum = 10 ** l * 9 if l + 1 <= 10 else float('inf')
        ans = (ans + count(l, l + 1, S, lnum, rnum)) % mod

    for k in range(1, S // 10000 + 1):
        l = S // k
        lnum = 10 ** (l - 1) * 9 if l <= 10 else float('inf')
        rnum = 10 ** l * 9 if l + 1 <= 10 else float('inf')
        ans = (ans + count(l, l + 1, S, lnum, rnum)) % mod

    for d in range(1, int(S ** 0.5) + 1):
        if S % d == 0:
            lnum = 10 ** (d - 1) * 9 if d <= 10 else float('inf')
            if S // d <= lnum:
                ans = (ans + pow_mod(10, d - 1, mod) * 9 - S // d + mod + 1) % mod

            if d * d < S:
                lnum = 10 ** ((S // d) - 1) * 9 if S // d <= 10 else float('inf')
                if d <= lnum:
                    ans = (ans + pow_mod(10, S // d - 1, mod) * 9 - d + mod + 1) % mod

    return ans % mod

# Sample Test Case
print(solve(1))