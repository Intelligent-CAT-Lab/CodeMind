def solve(k):
    m = len("FESTIVAL")
    n = 600
    l = m - 1
    dp = [[0] * (l + 1) for _ in range(n + 1)]
    for i in range(n):
        dp[i][0] = 1
        for j in range(l):
            for p in range(i + 1):
                for q in range(j + 1):
                    dp[i + 1][j + 1] += dp[p][q]
    a = [0] * (n + 1)
    for i in range(n, 0, -1):
        a[i] = k // dp[i][l]
        k -= a[i] * dp[i][l]
    s = ""
    for i in range(1, n + 1):
        s += "FESTIVA"
        for _ in range(a[i]):
            s += "L"
    return s