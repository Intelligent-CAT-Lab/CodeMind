import sys
from math import inf

class p01593:
    INF = 1 << 28
    EPS = 1e-12

    def run(self):
        self.n, self.m = map(int, input().split())
        self.solve()

    def solve(self):
        dp = [0.0] * (self.n + 1)
        dp[0] =