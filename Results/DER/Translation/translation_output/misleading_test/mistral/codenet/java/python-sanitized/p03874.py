def solve(k):
    m = "FESTIVAL".length()
    n = 600
    l = m - 1
    dp = [[1] * (l + 1) for _ in range(n + 1)]
    for i in range(1, n + 1):
        for j in range(1, l + 1):
            for p in range(i):
                for q in range(j):
                    dp[i][j] += dp[p][q]
    a = [k // dp[i][l] for i in range(n, 0, -1)]
    sb = ""
    for i in range(1, n + 1):
        sb += "FESTIVA" * (a[i] - 1)
    return sb

def check(s):
    t = "FESTIVAL"
    m = t.length()
    map = [i for i, char in enumerate(t) if char == 'A']
    n = s.length()
    a = [map[ord(char) - ord('A')] for char in s]
    dp = [[1] * (m + 1) for _ in range(n + 1)]
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            dp[i][j] = dp[i - 1][j]
        dp[i][a[i] + 1] += dp[i - 1][a[i]]
    return dp[n][m]

if __name__ == "__main__":
    k = int(input())
    print(solve(k))