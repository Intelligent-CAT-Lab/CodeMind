import sys

class p01593:
	def __init__(self):
		self.sc = sys.stdin
		self.INF = 1<<28
		self.EPS = 1e-12
		self.n = 0
		self.m = 0

	def run(self):
		self.n = int(self.sc.readline())
		self.m = int(self.sc.readline())
		self.solve()

	def solve(self):
		dp = [0.0 for i in range(self.n+1)]
		dp[0] =