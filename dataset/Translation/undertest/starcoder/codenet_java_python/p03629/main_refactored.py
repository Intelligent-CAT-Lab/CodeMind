class main:
    import sys
    
    def solve():
        s = input()
        n = len(s)
        dp = [[[0, 0] for _ in range(26)] for _ in range(n + 1)]
        for i in range(26):
            dp[n][i] = [i, 1]
        for i in range(n - 1, -1, -1):
            for j in range(26):
                for k in range(2):
                    dp[i][j][k] = dp[i + 1][j][k]
            cur = ord(s[i]) - ord('a')
            mi = 2 * n
            for j in range(26):
                mi = min(mi, dp[i + 1][j][1])
            for j in range(26):
                if dp[i + 1][j][1] == mi:
                    dp[i][cur][0] = j
                    dp[i][cur][1] = dp[i + 1][j][1] + 1
                    break
        mi = 2 * n
        cur = -1
        for i in range(26):
            mi = min(mi, dp[0][i][1])
        for i in range(26):
            if dp[0][i][1] == mi:
                cur = i
                break
        ret = chr(cur + ord('a'))
        for i in range(n):
            if dp[i][cur][0] == dp[i + 1][cur][0] and dp[i][cur][1] == dp[i + 1][cur][1]:
                continue
            ret += chr(dp[i][cur][0] + ord('a'))