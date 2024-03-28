import sys

def solve(n):
    dp = [0] * (n + 1)
    dp[0] = 1
    for i in range(3, n + 1):
        for j in range(3, i + 1):
            dp[i] = (dp[i] + dp[i - j]) % 1000000007
    return dp[n]

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    print(solve(n))