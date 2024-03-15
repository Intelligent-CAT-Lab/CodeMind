Here is the translated code from Java to Python:

```python
import math

def pow(a, n, mod):
    ret = 1
    x = n.bit_length() - 1
    while x >= 0:
        ret = ret * ret % mod
        if n & (1 << x):
            ret = ret * a % mod
        x -= 1
    return ret

def exgcd(a, b):
    if a == 0 or b == 0: return None
    asgn, bsgn = int(math.copysign(1, a)), int(math.copysign(1, b))
    a, b = abs(a), abs(b)
    p, q, r, s = 1, 0, 0, 1
    while b > 0:
        c, a, b = divmod(a, b) + (b,)
        p, q = q, p - c * q
        r, s = s, r - c * s
    return a, p * asgn, r * bsgn

def count(l, r, rem, lnum, rnum):
    if r - l > 1:
        gpr = exgcd(l, r)
        if rem % gpr[0] != 0:
            return 0
        a, b, da, db = gpr[1] * (rem // gpr[0]), gpr[2] * (rem // gpr[0]), r // gpr[0], l // gpr[0]
    else:
        a, b, da, db = -rem, rem, r, l

    if a <= 0:
        need = -a // da + 1
        a += need * da
        b -= need * db

    need = (a - 1) // da
    a -= need * da
    b += need * db

    if b > rnum:
        need = (b - (rnum + 1)) // db + 1
        b -= need * db
        a += need * da

    mina = a

    if b <= 0:
        need = -b // db + 1
        b += need * db
        a -= need * da

    need = (b - 1) // db
    b -= need * db
    a += need * da

    if a > lnum:
        need = (a - (lnum + 1)) // da + 1
        a -= need * da
        b += need * db

    maxa = a
    return 0 if mina > maxa else (maxa - mina) // da + 1

def solve(S):
    mod = 1000000007
    ans = 0
    for midl in range(2, 9):
        mid = 0
        for midr in range(midl, 9):
            mid += 10**(midr - 1) * 9 * midr
            if mid >= S: break

            rem = S - mid
            l, r, lnum, rnum = midl - 1, midr + 1, 10**(l - 1) * 9, 10**(r - 1) * 9
            ans += count(l, r, rem, lnum, rnum)
            ans %= mod

    for l in range(1, 10001):
        lnum = math.inf if l > 10 else 10**(l - 1) * 9
        rnum = math.inf if l + 1 > 10 else 10**(l) * 9
        ans += count(l, l + 1, S, lnum, rnum)
        ans %= mod

    k = 1
    while S // k > 10000:
        l = S // k
        lnum = math.inf if l > 10 else 10**(l - 1) * 9
        rnum = math.inf if l + 1 > 10 else 10**(l) * 9
        ans += count(l, l + 1, S, lnum, rnum)
        ans %= mod
        k += 1

    d = 1
    while d * d <= S:
        if S % d == 0:
            lnum = math.inf if d > 10 else 10**(d - 1) * 9
            if S // d <= lnum:
                ans += (pow(10, d - 1, mod) * 9 - S // d + mod + 1)
                ans %= mod
            if d * d < S:
                lnum = math.inf if S // d > 10 else 10**((S // d) - 1) * 9
                if d <= lnum:
                    ans += (pow(10, (S // d) - 1, mod) * 9 - d + mod + 1)
                    ans %= mod
        d += 1

    return ans % mod

# Usage
S = int(input())
print(solve(S))
```

Note: There is no direct equivalent in Python for Java's large input reading and parsing mechanism. The exact interpretation or translation might require additional context such as how the input is provided, which was given by standard input with specific parsing needs in the Java code.

Let me know if you need further explanations or adjustments based on the input method you're using with this Python code.
