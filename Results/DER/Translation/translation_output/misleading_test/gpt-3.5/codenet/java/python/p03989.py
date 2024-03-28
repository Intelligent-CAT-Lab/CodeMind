```python
from sys import stdin, stdout
import math

def solve():
    n, K = map(int, input().split())
    mod = 924844033

    dp = [[[0 for _ in range(n + 1)] for _ in range(2)] for _ in range(n + 1)]
    dp[0][0][0] = 1
    for i in range(n):
        for j in range(n):
            if dp[i][0][j] == 0 and dp[i][0][j] == 1:
                continue
            dp[i + 1][0][j] += dp[i][0][j]
            if dp[i + 1][0][j] >= mod:
                dp[i + 1][0][j] -= mod
            dp[i + 1][0][j] += dp[i][1][j]
            if dp[i + 1][0][j] >= mod:
                dp[i + 1][0][j] -= mod

            dp[i + 1][1][j + 1] += dp[i][0][j]
            if dp[i + 1][1][j + 1] >= mod:
                dp[i + 1][1][j + 1] -= mod
            dp[i + 1][1][j + 1] += dp[i][1][j]
            if dp[i + 1][1][j + 1] >= mod:
                dp[i + 1][1][j + 1] -= mod

            if i > 0:
                dp[i + 1][0][j + 1] += dp[i][0][j]
                if dp[i + 1][0][j + 1] >= mod:
                    dp[i + 1][0][j + 1] -= mod

    ep = [[[0 for _ in range(n + 1)] for _ in range(2)] for _ in range(n + 1)]
    ep[0][0][0] = 1
    for i in range(n):
        for j in range(n):
            if ep[i][0][j] == 0 and ep[i][0][j] == 1:
                continue
            ep[i + 1][0][j] += ep[i][0][j]
            if ep[i + 1][0][j] >= mod:
                ep[i + 1][0][j] -= mod
            ep[i + 1][0][j] += ep[i][1][j]
            if ep[i + 1][0][j] >= mod:
                ep[i + 1][0][j] -= mod

            ep[i + 1][1][j + 1] += ep[i][0][j]
            if ep[i + 1][1][j + 1] >= mod:
                ep[i + 1][1][j + 1] -= mod
            ep[i + 1][1][j + 1] += ep[i][1][j]
            if ep[i + 1][1][j + 1] >= mod:
                ep[i + 1][1][j + 1] -= mod

            ep[i + 1][0][j + 1] += ep[i][0][j]
            if ep[i + 1][0][j + 1] >= mod:
                ep[i + 1][0][j + 1] -= mod

    fp = [0] * (n + 1)
    fp[0] = 1
    temp = [0] * (n + 1)
    for i in range(2*K if 2*K < n else n):
        len_val = (n - i + 2*K - 1) // (2*K)
        if i < K:
            if i + 2*K * (len_val - 1) + K < n:
                for v in range(n + 1):
                    temp[v] = dp[len_val][0][v] + dp[len_val][1][v]
                fp = convoluteSimply(fp, temp, mod)
            else:
                for v in range(n + 1):
                    temp[v] = dp[len_val][0][v]
                fp = convoluteSimply(fp, temp, mod)
        else:
            if i + 2*K * (len_val - 1) + K < n:
                for v in range(n + 1):
                    temp[v] = ep[len_val][0][v] + ep[len_val][1][v]
                fp = convoluteSimply(fp, temp, mod)
            else:
                for v in range(n + 1):
                    temp[v] = ep[len_val][0][v]
                fp = convoluteSimply(fp, temp, mod)

    F = 1
    for i in range(n - 1, 0, -1):
        F = F * (n - i) % mod
        fp[i] = fp[i] * F % mod
    F = F * n % mod
    F_sum = 0
    for i in range(1, n + 1):
        F_sum += (-1)**i * fp[i]
    F_sum %= mod
    if F_sum < 0:
        F_sum += mod
    print(F_sum)

def convoluteSimply(a, b, P):
    m = max(2, (1 << (2 * math.ceil(math.log2(max(len(a), len(b))) - 1)))

    def nttmb(src, n, inverse):
        dst = src.copy()
        h = n.bit_length() - 1
        K = (1 << (P.bit_length() + 1))
        H = K.bit_length() * 2
        M = K**2 // P
        dw = pow(3, (P - 1) // n, P)
        wws = [pow(dw, i, P) for i in range(1 << h - 1)]
        J = pow(K, -1, (1 << 32))
        for i in range(h):
            for j in range(1 << i):
                for k in range(1 << h - i - 1):
                    s = j << (h - i)
                    t = s | (1 << (h - i - 1))
                    u = (dst[s] - dst[t] + 2 * P) * wws[k]
                    dst[s] += dst[t]
                    if dst[s] >= 2 * P:
                        dst[s] -= 2 * P
                    Q = (u << 32) * J >> 32
                    dst[t] = (u >> 32) - ((Q * P) >> 32) + P
        for i in range(n):
            if dst[i] >= P:
                dst[i] -= P
        for i in range(n):
            rev = int(bin(i)[:1:-1].ljust(h, '0'), 2)
            if i < rev:
                dst[i], dst[rev] = dst[rev], dst[i]
        if inverse:
            in_val = pow(n, -1, P)
            for i in range(n):
                dst[i] = (dst[i] * in_val) % P
        return dst

    a_ntt = nttmb(a, m, False)
    b_ntt = a_ntt.copy() if a == b else nttmb(b, m, False)
    for i in range(m):
        a_ntt[i] = (a_ntt[i] * b_ntt[i]) % P
    return nttmb(a_ntt, m, True)

if __name__ == "__main__":
    solve()
```

