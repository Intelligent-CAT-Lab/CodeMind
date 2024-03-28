import sys

def solve():
    s = sys.stdin.readline()
    d = list(s)
    dp = [1] * 13
    base = 1
    for i in range(len(d) - 1, -1, -1):
        if d[i] == '?':
            for k in range(10):
                for j in range(13):
                    dp[j] += dp[k * base + j]
                    dp[j] %= 1000000007
        else:
            k = int(d[i]) - 48
            for j in range(13):
                dp[j] += dp[k * base + j]
                dp[j] %= 1000000007
        base *= 10
        base %= 13
    print(dp[5])

solve()