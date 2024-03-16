import sys
import re
from itertools import combinations

def solve(strs):
    N = len(strs)
    N2 = N
    INF = 1 << 29

    str2 = [s for s in strs if s not in strs[:strs.index(s)]]
    N2 = len(str2)

    len_ = [[0]*N2 for _ in range(N2)]
    for i, j in combinations(range(N2), 2):
        offset = 0
        l = len(str2[i])
        for offset in range(l):
            if str2[j].startswith(str2[i][offset:]):
                break
        len_[i][j] = len(str2[j]) - (l - offset)

    dp = [[INF]*N2 for _ in range(1 << N2)]
    for i in range(N2):
        dp[1 << i][i] = len(str2[i])

    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j] >= INF:
                continue
            for k in range(N2):
                if (i & (1 << k)) > 0:
                    continue
                new_idx = i | (1 << k)
                dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_[j][k])

    ans = INF
    tmp = (1 << N2) - 1
    for i in range(N2):
        ans = min(ans, dp[tmp][i])
    return ans

def main():
    for line in sys.stdin:
        N = int(line)
        if N == 0:
            break
        strs = [next(sys.stdin) for _ in range(N)]
        print(solve(strs))

if __name__ == "__main__":
    main()