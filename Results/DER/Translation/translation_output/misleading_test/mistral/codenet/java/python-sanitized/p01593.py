import sys

def run():
    n, m = map(int, input().split())
    solve(n, m)

def solve(n, m):
    dp = [1] * (n+1)
    for j in range(1, n+1):
        for i in range(1, min(m, j)+1):
            dp[j] += dp[j-i] / j
    print(f"{dp[n]:.12f}")

if __name__ == "__main__":
    run()