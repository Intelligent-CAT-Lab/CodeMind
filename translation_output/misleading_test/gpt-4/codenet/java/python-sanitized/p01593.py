from math import inf

class P01593:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-12
        self.n, self.m = map(int, input().split())
        self.solve()

    def solve(self):
        dp = [0] * (self.n + 1)
        dp[0] = 1
        for j in range(1, self.n + 1):
            for i in range(1, min(self.m, j) + 1):
                dp[j] += dp[j - i] / j
        print(f"{dp[self.n]:.12f}")

if __name__ == "__main__":
    P01593()