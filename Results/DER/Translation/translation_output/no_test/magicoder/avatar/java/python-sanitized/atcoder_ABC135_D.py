import sys

M = 10**9 + 7
s = sys.stdin.readline().strip()
dp = [[0]*13 for _ in range(len(s)+1)]
map = {0:4, 1:8, 2:12, 3:3, 4:7, 5:11, 6:2, 7:6, 8:10, 9:1, 10:5, 11:9}

dp[0][0] = 1

for i in range(1, len(s)+1):
    ch = s[i-1]
    for j in range(13):
        if ch == '?':
            for k in range(10):
                l = j - k
                if l < 0:
                    l += 13
                dp[i][j] += dp[i-1][map[l]]
                if dp[i][j] >= M:
                    dp[i][j] -= M
        else:
            l = j - int(ch)
            if l < 0:
                l += 13
            dp[i][j] = dp[i-1][map[l]]

print(dp[len(s)][5])