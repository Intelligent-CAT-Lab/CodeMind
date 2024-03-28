import math
import re

class AOJ1320:
    def __init__(self):
        self.sc = Scanner(System.in)

    def solve(self):
        N = self.sc.nextInt()
        if N == 0:
            return

        str = []
        for i in range(N):
            str.append(self.sc.next())

        eq = [False] * N
        for i in range(N):
            if eq[i]:
                continue
            for j in range(N):
                if i != j and not eq[j] and re.match(str[i], str[j]):
                    eq[j] = True

        str2 = []
        for i in range(N):
            if not eq[i]:
                str2.append(str[i])

        N2 = len(str2)

        len = [[0] * N2 for _ in range(N2)]
        for i in range(N2):
            for j in range(N2):
                if i == j:
                    continue
                offset = 0
                l = len(str2[i])
                for offset in range(l):
                    if str2[j].startswith(str2[i][offset:]):
                        break
                len[i][j] = len(str2[j]) - (l - offset)

        dp = [[INF] * N2 for _ in range(1 << N2)]
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
                    dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len[j][k])

        ans = INF
        tmp = (1 << N2) - 1
        for i in range(N2):
            ans = min(ans, dp[tmp][i])
        print(ans)

if __name__ == "__main__":
    AOJ1320().solve()