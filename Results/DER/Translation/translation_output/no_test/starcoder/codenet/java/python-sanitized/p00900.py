import sys
import math

class P:
	def __init__(self, x, y):
		self.x = x
		self.y = y

class Solution:
	def __init__(self):
		self.INF = 1 << 28
		self.EPS = 1e-10
		self.dx = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
		self.dy = [-1, 0, 1, -1, 0, 1, -1, 0, 1]
		self.memo = {}
		self.pow10 = [100]
		self.size = 0
		self.h = 0
		self.w = 0
		self.map = []
		self.bomb = []
		self.ps = []

	def run(self):
		self.readInput()
		self.solve()

	def readInput(self):
		for line in sys.stdin:
			h, w = map(int, line.split())
			if h == 0 and w == 0:
				break
			self.h = h
			self.w = w
			self.map = [[-1 for i in range(w)] for j in range(h)]
			self.bomb = [[False for i in range(w)] for j in range(h)]
			self.ps = []
			for i in range(h):
				l = sys.stdin.readline().strip()
				for j in range(w):
					if l[j] == '.':
						self.map[i][j] = -1
					elif l[j] == '*':
						self.map[i][j] = 0
					else:
						self.map[i][j] = l[j] - '0'
						self.ps.append(P(j, i))
			self.size = len(self.ps)
			self.pow10 = [100]
			for i in range(1, self.size):
				self.pow10.append(self.pow10[i-1] * 10)
			self.solve()

	def solve(self):
		S = self.pow10[0] * self.map[self.ps[0].y][self.ps[0].x]
		for i in range(1, self.size):
			S += self.pow10[i] * self.map[self.ps[i].y][self.ps[i].x]
		p = S % 100
		if self.memo.has_key(S):
			print self.memo[S]
			return
		if S % 100 == self.size:
			if S / 100 == 0:
				print 0
				return
			print self.INF
			return
		if self.solve(S, 0) == self.INF:
			print self.INF
			return
		print self.solve(S, 0)

	def solve(self, S, cnt):
		p = S % 100
		if self.memo.has_key(S):
			return self.memo[S]
		if S % 100 == self.size:
			if S / 1