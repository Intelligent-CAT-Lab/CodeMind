import sys

def solve():
    S = input()
    d = list(S)
    dp = [0] * 13
    dp[0] = 1
    base = 1
    for i in range(len(d)-1, -1, -1):
        next_dp = [0] * 13
        if d[i] == '?':
            for k in range(10):
                for j in range(13):
                    next_dp[(k*base + j) % 13] += dp[j]
                    next_dp[(k*base + j) % 13] %= 1000000007
        else:
            k = int(d[i]) - '0'
            for j in range(13):
                next_dp[(k*base + j) % 13] += dp[j]
                next_dp[(k*base + j) % 13] %= 1000000007
        dp = next_dp
        base *= 10
        base %= 13
    print(dp[5])

if __name__ == '__main__':
    solve()