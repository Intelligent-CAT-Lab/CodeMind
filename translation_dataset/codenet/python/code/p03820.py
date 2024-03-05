import sys
import numpy as np
import numba
from numba import njit, b1, i4, i8
from numba.types import Omitted

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

MOD = 1_000_000_007

@njit((i8, i8), cache=True)
def main(N, K):
    K -= 1
    U = 2010
    C = np.zeros((U, U), np.int64)
    C[0, 0] = 1
    for n in range(1, U):
        C[n] += C[n - 1]
        C[n, 1:] += C[n - 1, :-1]
        C[n] %= MOD

    dp = np.zeros((N + 10, N + 10), np.int64)
    dp[0, 0] = 1
    for n in range(1, N + 10):
        dp[n, n] = (dp[n - 1, n - 1] + dp[n - 1, n]) % MOD
        for m in range(n + 1, N + 10):
            dp[n, m] = (dp[n - 1, m] + dp[n, m - 1]) % MOD
    for n in range(N + 9, 0, -1):
        dp[n] -= dp[n - 1]
        dp[n] %= MOD
    ans = 0
    if K == N - 1:
        return dp[:N, N - 1].sum() % MOD
    for r in range(N - K, N + 1):
        x = C[r - 2, N - K - 2]
        a = N - r
        b = K - a
        if b == 0:
            x = x * (dp[:a + 1, a].sum() % MOD) % MOD
        else:
            x *= (dp[1:a + 2, a + 1] * C[b - 1:a + b, b - 1][::-1] %
                  MOD).sum() % MOD
            x %= MOD
        ans += x
    ans %= MOD
    for i in range(N - K - 2):
        ans = ans * 2 % MOD
    return ans % MOD

N, K = map(int, read().split())
print(main(N, K))
