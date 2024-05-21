import sys
import re

def solve(strs):
    N = len(strs)
    dp = [[sys.maxsize] * N for _ in range(1 << N)]
    for i in range(N):
        dp[1 << i][i] = len(strs[i])

    for i in range(1 << N):
        for j in range(N):
            if dp[i][j] == sys.maxsize:
                continue
            for k in range(N):
                if (i & (1 << k)) > 0:
                    continue
                new_i = i | (1 << k)
                dp[new_i][k] = min(dp[new_i][k], dp[i][j] + len(strs[k]) - len(re.search(strs[j], strs[k]).group(0)))

    ans = sys.maxsize
    for i in range(N):
        ans = min(ans, dp[(1 << N) - 1][i])
    return ans

while True:
    N = int(input())
    if N == 0:
        break
    strs = [input() for _ in range(N)]
    print(solve(strs))