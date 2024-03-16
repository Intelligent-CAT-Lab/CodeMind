import sys

class p03479:
	def __init__(self):
		self.INPUT = ""
		self.is = sys.stdin
		self.out = sys.stdout

	def solve(self):
		x,y = self.nl(),self.nl()
		ans = 0
		for i in range(x,y+1):
			if i%2==0:
				ans+=1
		self.out.write(str(ans)+"\n")

	def run(self):
		s = time.time()
		self.solve()
		self.out.flush()
		print("time:",time.time()-s)

p03479().run()