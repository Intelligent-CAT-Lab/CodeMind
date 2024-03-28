import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    dp = [[0] * (n + 1) for _ in range(n + 1)]
    dp[1][0] = 1
    for _ in range(m):
        next_dp = [[0] * (n + 1) for _ in range(n + 1)]
        for a in range(n + 1):
            for b in range(n + 1):
                if dp[a][b] == 0:
                    continue
                next_dp[a + b][0] = (next_dp[a + b][0] + dp[a][b] * a) % 1000000007
                next_dp[a][b + 1] = (next_dp[a][b + 1] + dp[a][b] * (n - a - b)) % 1000000007
                next_dp[a][b] = (next_dp[a][b] + dp[a][b] * b) % 1000000007
        dp = next_dp
    print(dp[n][0])


if __name__ == "__main__":
    main()