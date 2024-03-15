```python
from typing import List

# Constants
INF = 1234567890
MINF = -1234567890
LINF = 123456789123456789
MLINF = -123456789123456789
MOD = int(1e9) + 7
EPS = 1e-10
y4 = [-1, 1, 0, 0]
x4 = [0, 0, -1, 1]
y8 = [0, 1, 0, -1, -1, 1, 1, -1]
x8 = [1, 0, -1, 0, 1, -1, 1, -1]

def solve() -> None:
    N, A, B, C, D = map(int, input().split())
    
    def setMod():
        fac = [1] * (int(1e6) + 1000)
        finv = [1] * (int(1e6) + 1000)
        inv = [1] * (int(1e6) + 1000)

        fac[0], fac[1] = 1, 1
        finv[0], finv[1] = 1, 1
        inv[1] = 1

        for i in range(2, int(1e6) + 1000):
            fac[i] = (fac[i - 1] * i) % MOD
            inv[i] = MOD - (inv[MOD % i] * (MOD // i)) % MOD
            finv[i] = (finv[i - 1] * inv[i]) % MOD
        
    dp = [[0] * (N + 1) for _ in range(N + 1)]
    mPowFinv = [[0] * (N + 1) for _ in range(N + 1)]
    
    for i in range(N + 1):
        dp[i][0] = 1

    for k in range(N + 1):
        mPowFinv[k][1] = finv[k]

    for k in range(N + 1):
        for i in range(2, D + 1):
            mPowFinv[k][i] = (mPowFinv[k][i - 1] * finv[k]) % MOD

    for k in range(1, N + 1):
        for n in range(1, N + 1):
            dp[k][n] = dp[k - 1][n]
            if not (A <= k and k <= B):
                continue
            for x in range(C, D + 1):
                if n - k * x >= 0:
                    cal = (fac[n] * finv[n - k * x] * mPowFinv[k][x] * finv[x]) % MOD
                    cal = (cal * dp[k - 1][n - k * x]) % MOD
                    dp[k][n] = (dp[k][n] + cal) % MOD
    
    print(dp[N][N])

if __name__ == "__main__":
    solve()
```
