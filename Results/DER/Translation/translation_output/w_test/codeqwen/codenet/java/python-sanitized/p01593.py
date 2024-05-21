import sys

def solve(n, m):
    dp = [0] * (n + 1)
    dp[0] = 1
    for j in range(1, n + 1):
        for i in range(1, min(m, j) + 1):
            dp[j] += dp[j - i] / j
    return dp[n]

def main():
    n, m = map(int, sys.stdin.readline().split())
    print("%.12f" % solve(n, m))

if __name__ == "__main__":
    main()