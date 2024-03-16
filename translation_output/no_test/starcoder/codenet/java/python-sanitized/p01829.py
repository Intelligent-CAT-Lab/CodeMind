import sys

class p01829:
	def __init__(self):
		self.S = ""
		self.ch = []
		self.use = [False for i in range(10)]
		self.minDiff = sys.maxsize
		self.ansStr = ""
		self.startStr = ""

	def dfs(self,n):
		if n == len(self.ch):
			self.ansStr = self.startStr
			return

		if n == 0:
			self.use[(self.ch[n] - '0' + 5) % 10] = True
			self.startStr = self.startStr + chr((self.ch[n] - '0' + 5) % 10 + '0')
			self.dfs(n + 1)
			return

		if not self.use[self.ch[n] - '0']:
			self.dfs2(n,"")
			self.use[self.ch[n] - '0'] = True
			self.startStr = self.startStr + self.ch[n]
			self.dfs(n + 1)
			return
		self.dfs2(n,"")

	def dfs2(self,n,s):
		if n == len(self.ch):
			a = int(self.S[self.startStr:])
			b = int(s)

			diff = abs(a - b)

			if self.minDiff > diff:
				self.ansStr = self.startStr + s
				self.minDiff = diff
			return

		for i in range(10):
			if self.use[i]:continue
			self.use[i] = True
			self.dfs2(n + 1,s + chr(i + '0'))
			self.use[i] = False

	def solve(self):
		self.S = input()
		self.ch = self.S.split()
		self.startStr = ""
		self.ansStr = ""
		self.dfs(0)
		print(self.ansStr)

p01829().solve()