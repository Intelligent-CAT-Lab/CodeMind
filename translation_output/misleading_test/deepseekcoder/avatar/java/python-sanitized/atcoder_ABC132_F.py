import sys

def solve(n, k):
    mod = int(1e9 + 7)

    len_list = []
    l = 1
    while l <= n:
        r = n // (n // l)
        len_list.append(r - l + 1)
        l = r + 1

    q = len(len_list)
    dp = [0] * (k * (q + 1))

    for j in range(1, q + 1):
        dp[j] = len_list[j - 1] + dp[j - 1]

    for i in range(1, k):
        for j in range(1, q + 1):
            dp[i * (q + 1) + j] = dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * len_list[j - 1]
            dp[i * (q + 1) + j] %= mod

    return dp[k * (q + 1) - 1]

n, k = map(int, sys.stdin.readline().split())
print(solve(n, k))