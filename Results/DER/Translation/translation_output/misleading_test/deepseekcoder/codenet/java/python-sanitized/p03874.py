import sys

def solve(k):
    m = len("FESTIVAL")
    n = 600
    l = m - 1
    dp = [[0 for _ in range(l + 1)] for _ in range(n + 1)]
    for i in range(n):
        dp[i][0] = 1
        for j in range(l):
            for p in range(i + 1):
                for q in range(j + 1):
                    dp[i + 1][j + 1] += dp[p][q]

    a = [0 for _ in range(n + 1)]
    for i in range(n, 0, -1):
        a[i] = k // dp[i][l]
        k -= a[i] * dp[i][l]

    result = []
    for i in range(1, n + 1):
        result.extend(["FESTIVA"[j] for j in range(a[i])])
    return "".join(result)

def check(s):
    t = "FESTIVAL"
    m = len(t)
    map = {t[i] : i for i in range(m)}

    n = len(s)
    a = [map[s[i]] for i in range(n)]

    dp = [[0 for _ in range(m + 1)] for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(m + 1):
            dp[i + 1][j] = dp[i][j]
        dp[i + 1][a[i] + 1] += dp[i][a[i]]
    return dp[n][m]

def main():
    start = sys.stdin.readline()
    print(solve(int(start)))

if __name__ == "__main__":
    main()