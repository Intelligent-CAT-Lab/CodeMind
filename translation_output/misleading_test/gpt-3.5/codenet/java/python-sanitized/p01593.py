class p01593:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-12
        self.n = 0
        self.m = 0

    def run(self):
        self.n, self.m = map(int, input().split())
        self.solve()

    def solve(self):
        dp = [0.0] * (self.n + 1)
        dp[0] =