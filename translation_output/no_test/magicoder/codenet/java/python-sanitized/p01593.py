import sys

class p01593:
    INF = 1 << 28
    EPS = 1e-12

    def __init__(self):
        self.n, self.m = map(int, sys.stdin.readline().split())

    def solve(self):
        dp = [0] * (self.n + 1)
        dp[0] = 1
        for j in range(1, self.n + 1):
            for i in range(1, min(self.m, j) + 1):
                dp[j] += dp[j - i] / j
        print("%.12f" % dp[self.n])

    def run(self):
        self.solve()

if __name__ == "__main__":
    p01593().run()