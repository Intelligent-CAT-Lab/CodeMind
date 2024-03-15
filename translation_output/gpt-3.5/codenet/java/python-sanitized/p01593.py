import math

class p01593:
    INF = 1 << 28
    EPS = 1e-12

    def __init__(self):
        self.n = 0
        self.m = 0

    def run(self):
        self.n = int(input())
        self.m = int(input())
        self.solve()

    def solve(self):
        dp = [0.0] * (self.n + 1)
        dp[0] =