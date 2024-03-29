```python
import sys
from io import BytesIO, IOBase
import math

def solve():
    S = ni()
    
    mod = 1000000007
    ans = 0
    for midl in range(2, 9):
        mid = 0
        for midr in range(midl, 9):
            mid += (10 ** (midr - 1)) * 9 * midr
            if mid >= S:
                break
                
            rem = S - mid
            l = midl - 1
            r = midr + 1
            lnum = (10 ** (l - 1)) * 9
            rnum = (10 ** (r - 1)) * 9

            res = count(l, r, rem, lnum, rnum)
            ans += res
            ans %= mod
    
    for l in range(1, 10001):
        lnum = 10 ** (l - 1) * 9 if l <= 10 else sys.maxsize // 2
        rnum = 10 ** (l + 1 - 1) * 9 if l + 1 <= 10 else sys.maxsize // 2
        ans += count(l, l+1, S, lnum, rnum)
        ans %= mod
    
    for k in range(1, S // 10000 + 1):
        l = S // k
        lnum = 10 ** (l - 1) * 9 if l <= 10 else sys.maxsize // 2
        rnum = 10 ** (l + 1 - 1) * 9 if l + 1 <= 10 else sys.maxsize // 2
        ans += count(l, l + 1, S, lnum, rnum)
        ans %= mod

    for d in range(1, int(math.sqrt(S)) + 1):
        if S % d == 0:
            lnum = 10 ** (d - 1) * 9 if d <= 10 else sys.maxsize // 2
            if S // d <= lnum:
                ans += (pow(10, d - 1, mod) * 9 - S // d + mod + 1)
                ans %= mod
            if d * d < S:
                rlnum = 10 ** (S // d - 1) * 9 if S // d <= 10 else sys.maxsize // 2
                if d <= rlnum:
                    ans += (pow(10, S // d - 1, mod) * 9 - d + mod + 1)
                    ans %= mod
    
    out.write(str(ans % mod) + '\n')

def pow(a, n, mod):
    ret = 1
    x = 63 - n.bit_length()
    for _ in range(x, -1, -1):
        ret = (ret * ret) % mod
        if n & (1 << 63 - _) < 0:
            ret = (ret * a) % mod
    return ret

def check(l, r, rem, lnum, rnum):
    lans = 0
    for a in range(1, lnum + 1):
        if (rem - l * a) % r == 0 and (rem - l * a) // r <= rnum and (rem - l * a) // r >= 1:
            lans += 1
    return lans

def count(l, r, rem, lnum, rnum):
    a = 0
    b = 0
    da = 0
    db = 0

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
    ret = max(0, (maxa - mina) // da + 1)

    return ret

def exgcd(a, b):
    if a == 0 or b == 0:
        return None
    as_ = 1 if a > 0 else -1
    bs = 1 if b > 0 else -1
    a = abs(a)
    b = abs(b)
    p, q, r, s = 1, 0, 0, 1
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
        d = r
        r = s
        s = d - c * s
    return [a, p * as_, r * bs]

def main():
    global S
    S = int(round(time.time() * 1000))
    global input_stream, out
    input_stream = BytesIO(INPUT.encode()) if INPUT else sys.stdin.buffer
    out = sys.stdout

    solve()
    out.flush()
    G = int(round(time.time() * 1000))
    print(G - S, "ms")

def readline():
    return input_stream.readline().rstrip().decode('utf-8')

def read_int():
    return int(readline())

def read_ints():
    return list(map(int, readline().split()))

if __name__ == '__main__':
    INPUT = ''
    main()
```
```
