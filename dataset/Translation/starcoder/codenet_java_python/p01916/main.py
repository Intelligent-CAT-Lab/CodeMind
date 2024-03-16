import sys

class p01916:
	def __init__(self):
		self.s = sys.stdin.readline().strip()
		self.a = [0]*26
		self.b = [0]*1111
		for i in self.s:
			self.a[ord(i)-ord('a')] += 1
		for i in range(26):
			self.b[self.a[i]] += 1
		for i in range(999,0,-2):
			if self.b[i] > 0:
				self.b[i] -= 1
				break
		m = 0
		for i in range(1,1001,2):
			m += self.b[i]
		if m%2 == 0:
			print(m//2)
		else:
			print(m//2+1)

p01916()