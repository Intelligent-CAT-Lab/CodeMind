def solve():
    print(solve_helper(nl()))


def solve_helper(k):
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

    sb = []
    for i in range(1, n + 1):
        sb.append("FESTIVA")
        for j in range(a[i]):
            sb.append("L")
    return ''.join(sb)


def check(s):
    t = "FESTIVAL"
    m = len(t)
    map = {ch: i for i, ch in enumerate(t)}

    n = len(s)
    a = [map[ch] for ch in s]

    dp = [[0] * (m + 1) for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(m + 1):
            dp[i + 1][j] = dp[i][j]
        dp[i + 1][a[i] + 1] += dp[i][a[i]]

    return dp[n][m]


def nl():
    return int(input())


if __name__ == "__main__":
    import sys
    if len(sys.argv) > 1:
        with open(sys.argv[1]) as file:
            solve()
    else:
        solve()