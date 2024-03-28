import sys
import io
import string

out = sys.stdout
ir = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
debug = False

def solve():
    a = ir.readline().strip()
    n = len(a)
    dp = [[[0, 0] for _ in range(26)] for _ in range(n + 1)]
    for i in range(26):
        dp[n][i] = [i, 1]
    for i in range(n - 1, -1, -1):
        for j in range(26):
            dp[i][j] = dp[i + 1][j]
        cur = ord(a[i]) - ord('a')
        mi = 2 * n
        for j in range(26):
            mi = min(mi, dp[i + 1][j][1])
        for j in range(26):
            if dp[i + 1][j][1] == mi:
                dp[i][cur][0] = j
                dp[i][cur][1] = dp[i + 1][j][1] +