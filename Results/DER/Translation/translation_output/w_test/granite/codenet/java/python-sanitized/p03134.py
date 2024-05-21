def solve(s):
    mod = 998244353
    r, b = 0, 0
    for c in s:
        if c == '0':
            r += 2
        elif c == '1':
            r += 1
            b += 1
        else:
            b += 2
    dp = [[0] * (r + 1) for _ in range(len(s) + 1)]
    dp[0][0] = 1
    for i in range(len(s)):
        for j in range(i + 1):
            if j + 1 <= r:
                dp[i + 1][j + 1] += dp[i][j]
                dp[i + 1][j + 1] %= mod
            if i - j + 1 <= b:
                dp[i + 1][j] += dp[i][j]
                dp[i + 1][j] %= mod
    combin = [[0] * (len(s) + 1) for _ in range(len(s) + 1)]
    for i in range(len(s) + 1):
        combin[i][0] = combin[i][i] = 1
    for i in range(2, len(s) + 1):
        for j in range(1, i):
            combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % mod
    ans = 0
    for i in range(min(r, len(s)) + 1):
        ways = dp[len(s)][i]
        lr = r - i
        lb = b - (len(s) - i)
        if lb < 0:
            continue
        ways *= combin[len(s)][lr]
        ways %= mod
        ans = (ans + ways) % mod
    return ans