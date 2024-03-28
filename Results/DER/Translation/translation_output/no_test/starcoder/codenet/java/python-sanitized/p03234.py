import sys

mod = 1000000007

class Solve:
	def __init__(self, io):
		self.io = io
		self.n = 0
		self.k = 0
		self.a = []
		self.b = []
		self.f = []
		self.dp = []
		self.memoWaysToPair = []

	def waysToPair(self, x):
		if self.memoWaysToPair[x]!= -1:
			return self.memoWaysToPair[x]

		if x%2 == 1:
			self.memoWaysToPair[x] = 0
		elif x == 0:
			self.memoWaysToPair[x] = 1
		else:
			self.memoWaysToPair[x] = self.waysToPair(x-2)*(x-1)%mod

		#self.io.println(x+" "+self.memoWaysToPair[x])
		return self.memoWaysToPair[x]

	def paired(self, x, y):
		#self.io.println(x+" "+y+" "+((self.f[y]-self.f[x-1])>(y-x+1)))
		return self.f[y]-self.f[x-1]

	def inside(self, a, x, y):
		return (x<=a and a<=y)

	def caldp(self, x, y):
		if self.dp[x