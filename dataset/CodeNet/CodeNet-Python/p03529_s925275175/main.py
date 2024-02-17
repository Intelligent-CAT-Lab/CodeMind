import sys
import numpy as np
import numba
from numba import njit
i8 = numba.int64

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

MOD = 1_000_000_007

@njit((i8, i8), cache=True)
def main(N, K):
    power = np.zeros(N + 10, np.int64)
    power[0] = 1
    for n in range(1, N + 10):
        power[n] = power[n - 1] * (K + 1) % MOD
    ret = K * (K + 1) // 2 * N * power[N - 1] % MOD

    dp = np.array([1], np.int64)
    dp[0] = 1
    for n in range(N, 0, -1):
        newdp = np.zeros(len(dp) * (n + 1) // n + 1, np.int64)
        for k in range(K + 1):
            for t in range(len(dp)):
                if k > n:
                    x = 0
                else:
                    x = (k + t) // n
                    ret -= x * dp[t] % MOD * power[n - 1] % MOD
                newdp[t + x] += dp[t]
        dp = newdp % MOD
    return ret % MOD

N, K = map(int, read().split())

print(main(N, K))