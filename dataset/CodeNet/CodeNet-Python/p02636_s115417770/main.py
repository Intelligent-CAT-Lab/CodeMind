import numpy as np
import numba as nb


@nb.njit('(i1[:],)', cache=True)
def solve(s):
    n = len(s)
    size = n // 2
    MOD = 998244353
    dp_can = np.zeros((n + 1, size + 1, size + 1), dtype=np.int8)
    dp_cnt = np.zeros((n + 1, size + 1, size + 1), dtype=np.int64)

    dp_cnt[n, 0] = 1
    for j in range(size):
        dp_cnt[n, j + 1] = np.cumsum(dp_cnt[n, j]) % MOD

    for i in range(n - 1, -1, -1):
        if s[i] == 0:
            for j in range(size + 1):
                dp_cnt[i, j] = np.cumsum(dp_cnt[i + 1, j]) % MOD
        else:
            for k in range(size + 1):
                dp_cnt[i, :, k] = np.cumsum(dp_cnt[i + 1, :, k]) % MOD

    dp_can[0, 0, 0] = 1
    for i in range(n):
        for j in range(size):
            for k in range(size):
                if dp_can[i, j, k] == 0:
                    continue
                dp_can[i + 1, j, k] = 1
                if j > 0 and s[i] == 1:
                    dp_can[i + 1, j - 1, k + 1] = 1
                if k > 0 and s[i] == 0:
                    dp_can[i + 1, j + 1, k - 1] = 1
                if i < n - 1:
                    if s[i] == 0 or s[i + 1] == 0:
                        dp_can[i + 2, j + 1, k] = 1
                    if s[i] == 1 or s[i + 1] == 1:
                        dp_can[i + 2, j, k + 1] = 1
    dp_can[1:, 0, 0] = 0

    ans = 0

    for i in range(n, -1, -1):
        for j in range(size + 1):
            for k in range(size + 1):
                if dp_can[i, j, k] == 0:
                    continue

                ans = (ans + dp_cnt[i, j, k]) % MOD

                a, b = j, k
                for h in range(i - 1, -1, -1):
                    if s[h] == 0:
                        a -= 1
                    else:
                        b -= 1
                    if a < 0 or b < 0:
                        break
                    dp_can[h, a, b] = 0

    return ans


s = np.array([int(c) for c in input()], dtype=np.int8)
print(solve(s))
