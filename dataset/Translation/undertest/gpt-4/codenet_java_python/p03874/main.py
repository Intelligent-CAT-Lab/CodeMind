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

    result = []
    for i in range(1, n + 1):
        result.append("FESTIVA")
        result.extend("L" * a[i])

    return ''.join(result)

def check(s):
    t = "FESTIVAL"
    m = len(t)
    map_t = {char: idx for idx, char in enumerate(t)}

    n = len(s)
    dp = [[0] * (m + 1) for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(m + 1):
            dp[i + 1][j] += dp[i][j]
        dp[i + 1][map_t[s[i]] + 1] += dp[i][map_t[s[i]]]

    return dp[n][m]

# Since the original code uses a BufferedReader and InputStreamReader,
# we can define our own input method for the test case.
def main():
    k = int(input().strip())
    result = solve(k)
    print(result)

main()  # You would call this with the input "7" to get the expected output "FESSSSSSSTIVAL".