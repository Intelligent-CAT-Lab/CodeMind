def solve(cc, mod=998244353):
    n = len(cc)
    r, b = 0, 0
    dp = [[1] * (n+1) for _ in range(n+1)]
    combin = [[1] * (n+1) for _ in range(n+1)]
    for i in range(1, n+1):
        if cc[i-1] == '0':
            r += 2
        elif cc[i-1] == '1':
            r += 1
            b += 1
        else:
            b += 2
    for i in range(1, n+1):
        for j in range(1, i+1):
            if j + 1 <= r:
                dp[i+1][j+1] = (dp[i][j] + dp[i][j-1]) % mod
            if j + 1 <= b:
                dp[i+1][j] = (dp[i][j] + dp[i-1][j]) % mod
    tto = 0
    for i in range(1, min(r, n)+1):
        ways = dp[n][i]
        lr = r - i
        lb = b - (n - i)
        if lb < 0:
            continue
        ways *= combin[n][lr]
        ways %= mod
        tto = (tto + ways) % mod
    return tto

if __name__ == "__main__":
    cc = input().strip().split()
    mod = int(input())
    tto = solve(cc, mod)
    print(tto)