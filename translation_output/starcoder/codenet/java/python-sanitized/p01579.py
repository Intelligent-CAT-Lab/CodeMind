import sys

class p01579:
	def __init__(self):
		self.sc = sys.stdin
		self.INF = 1 << 28
		self.EPS = 1e-9
		self.s = None

	def run(self):
		self.s = self.sc.readline().strip()
		self.solve()

	def solve(self):
		n = len(self.s)
		count = [0] * (2 * n + 1)
		now = 0
		for i in range(n):
			if self.s[i] == '(':
				now += 1
			else:
				now -= 1
			count[now + n] += 1
		# self.debug(count)
		now = 0
		ans = 0
		for i in range(n):
			if self.s[i] == '(':
				now += 1
			else:
				now -= 1
			count[now + n] -= 1
			# self.debug(now, count[now + n])
			ans += count[now + n]
		print(ans)

	def println(self, s):
		print(s)

	def print(self, s):
		print(s, end='')

	def debug(self, *os):
		print(*os, file=sys.stderr)

	def deepToString(self, o):
		return str(o)

p01579().run()