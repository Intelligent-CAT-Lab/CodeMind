import sys

def solve():
    S = sys.stdin.readline().strip()
    d = list(S)
    dp = [1] + [0] * 12
    base = 1
    for i in range(len(d) - 1, -1, -1):
        next_dp = [0] * 13
        if d[i] == '?':
            for k in range(10):
                for j in range(13):
                    next_dp[(k * base + j) % 13] += dp[j]
                    next_dp[(k * base + j) % 13] %= 1000000007
        else:
            k = ord(d[i]) - ord('0')
            for j in range(13):
                next_dp[(k * base + j) % 13] += dp[j]
                next_dp[(k * base + j) % 13] %= 1000000007
        dp = next_dp
        base *= 10
        base %= 13
    print(dp[5])

if __name__ == "__main__":
    solve()