```python
import sys
from io import BytesIO, IOBase
import math
import array

def solve():
    n, K = map(int, input().split())
    mod = 924844033

    dp = [[[0] * (n+1) for _ in range(2)] for _ in range(n+1)]
    dp[0][0][0] = 1
    for i in range(n):
        for j in range(n):
            if dp[i][0][j] == 0 and dp[i][0][j] == 1:
                continue
            dp[i+1][0][j] += dp[i][0][j]
            if dp[i+1][0][j] >= mod:
                dp[i+1][0][j] -= mod
            dp[i+1][0][j] += dp[i][1][j]
            if dp[i+1][0][j] >= mod:
                dp[i+1][0][j] -= mod

            dp[i+1][1][j+1] += dp[i][0][j]
            if dp[i+1][1][j+1] >= mod:
                dp[i+1][1][j+1] -= mod
            dp[i+1][1][j+1] += dp[i][1][j]
            if dp[i+1][1][j+1] >= mod:
                dp[i+1][1][j+1] -= mod

            if i > 0:
                dp[i+1][0][j+1] += dp[i][0][j]
                if dp[i+1][0][j+1] >= mod:
                    dp[i+1][0][j+1] -= mod

    ep = [[[0] * (n+1) for _ in range(2)] for _ in range(n+1)]
    ep[0][0][0] = 1
    for i in range(n):
        for j in range(n):
            if ep[i][0][j] == 0 and ep[i][0][j] == 1:
                continue
            ep[i+1][0][j] += ep[i][0][j]
            if ep[i+1][0][j] >= mod:
                ep[i+1][0][j] -= mod
            ep[i+1][0][j] += ep[i][1][j]
            if ep[i+1][0][j] >= mod:
                ep[i+1][0][j] -= mod

            ep[i+1][1][j+1] += ep[i][0][j]
            if ep[i+1][1][j+1] >= mod:
                ep[i+1][1][j+1] -= mod
            ep[i+1][1][j+1] += ep[i][1][j]
            if ep[i+1][1][j+1] >= mod:
                ep[i+1][1][j+1] -= mod

            ep[i+1][0][j+1] += ep[i][0][j]
            if ep[i+1][0][j+1] >= mod:
                ep[i+1][0][j+1] -= mod

    fp = [0] * (n+1)
    fp[0] = 1
    temp = [0] * (n+1)
    for i in range(2*K if 2*K < n else n):
        len_val = (n-i+2*K-1)//(2*K)
        if i < K:
            if i+2*K*(len_val-1)+K < n:
                temp = [dp[len_val][0][v] + dp[len_val][1][v] for v in range(n+1)]
                fp = convoluteSimply(fp, temp, mod, 5)
            else:
                temp = [dp[len_val][0][v] for v in range(n+1)]
                fp = convoluteSimply(fp, temp, mod, 5)
        else:
            if i+2*K*(len_val-1)+K < n:
                temp = [ep[len_val][0][v] + ep[len_val][1][v] for v in range(n+1)]
                fp = convoluteSimply(fp, temp, mod, 5)
            else:
                temp = [ep[len_val][0][v] for v in range(n+1)]
                fp = convoluteSimply(fp, temp, mod, 5)

    F = 1
    for i in range(n-1, 0, -1):
        F = F * (n-i) % mod
        fp[i] = fp[i] * F % mod
    F = F * n % mod
    sig = -1
    for i in range(1, n+1):
        F += sig * fp[i]
        sig = -sig
    F %= mod
    if F < 0:
        F += mod
    print(F)

def convoluteSimply(a, b, P, g):
    m = max(2, 1 << (max(len(a), len(b))-1).bit_length() << 2)
    fa = nttmb(a, m, False, P, g)
    fb = fa if a == b else nttmb(b, m, False, P, g)
    for i in range(m):
        fa[i] = fa[i] * fb[i] % P
    return nttmb(fa, m, True, P, g)

# Implementation of nttmb, invl, and related functions here

def read_int():
    return int(input())

def main():
    solve()

if __name__ == "__main__":
    main()
```

