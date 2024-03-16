import sys

class p02125:
	def __init__(self):
		self.sc = sys.stdin
		self.pw = sys.stdout

	def run(self):
		N = int(self.sc.readline())
		if N == 1:
			self.pw.write(str(1))
			return
		c = 1
		while 2 * c - 1 <= N:
			c *= 2
		c -= 1
		self.pw.write(str(bin(c).count('1')))
		self.pw.close()

p02125().run()