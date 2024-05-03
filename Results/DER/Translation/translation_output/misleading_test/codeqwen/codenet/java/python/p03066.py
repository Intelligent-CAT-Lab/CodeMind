Here is the Python equivalent of the Java code:

```python
import sys

def solve():
    mod = 998244353
    n, K = map(int, input().split())
    ans = 0
    {
        dp: [1] * K,
        for i in range(n):
            ndp: [0] * K,
            for j in range(K):
                for k in range(3):
                    if j + k < K:
                        ndp[j + k] += dp[j]
                        ndp[j + k] %= mod
            dp = ndp
    }
    for v in dp:
        ans += v
    ans %= mod
    # 2   2
    fif = enumFIF(10000, mod)
    for s in range(K + 1, 2 * K - 1, 2):
        u = s - K
        if u % 2 == 1:
            u += 1
        two = u // 2 + (s - (K - 1)) // 2
        # s-two*2
        for i in range((s - two * 2 + 1) // 2, s - two * 2 + 1):
            ans += C(i, s - two * 2 - i, mod, fif) * C(n, i + two, mod, fif)
            ans %= mod
    if K % 2 == 1:
        ans += pow(2, n, mod)
        {
            dp: [1] * K,
            for i in range(n):
                ndp: [0] * K,
                for j in range(K):
                    for k in range(2):
                        if j + k < K:
                            ndp[j + k] += dp[j]
                            ndp[j + k] %= mod
                dp = ndp
        }
        for v in dp:
            ans -= v
        ans %= mod
        if ans < 0:
            ans += mod
    print(ans)

def C(n, r, mod
