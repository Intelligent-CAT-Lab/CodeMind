def solve(s):
    n = len(s)
    dp = [[0] * 26 for _ in range(n + 1)]
    for i in range(n - 1, -1, -1):
        for j in range(26):
            dp[i][j] = dp[i + 1][j]
        dp[i][ord(s[i]) - ord('a')] = i + 1
    ans = []
    now = 0
    for i in range(n):
        for j in range(26):
            if dp[now][j] > dp[now][ord(s[i]) - ord('a')]:
                ans.append(chr(ord('a') + j))
                now = dp[now][j]
                break
    return ''.join(ans)

s = input()
print(solve(s))