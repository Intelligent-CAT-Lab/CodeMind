import sys

class p01872:
	def __init__(self):
		self.inpt = sys.stdin
		self.outpt = sys.stdout

	def solve(self):
		s = self.inpt.readline().strip()
		if s[-1] == '?':
			sum = 0
			for i in range(len(s) - 1):
				n = 11 - i
				q = 0
				p = ord(s[i]) - ord('0')
				if n <= 6 and n >= 1:
					q = n + 1
				else:
					q = n - 5
				sum += q * p
			sum %= 11
			if sum <= 1:
				sum = 0
			else:
				sum = 11 - sum
			self.outpt.write(str(sum) + '\n')
		else:
			check = ord(s[-1]) - ord('0')
			cnt = 0
			ans = 0
			for j in range(10):
				sum = 0
				for i in range(len(s) - 1):
					n = 11 - i
					q = 0
					p = 0
					if s[i] == '?':
						p = j
					else:
						p = ord(s[i]) - ord('0')
					if n <= 6 and n >= 1:
						q = n + 1
					else:
						q = n - 5
					sum += q * p
				sum %= 11
				if sum <= 1:
					sum = 0
				else:
					sum = 11 - sum
				if check == sum:
					cnt += 1
					ans = j
			if cnt == 1:
				self.outpt.write(str(ans) + '\n')
			else:
				self.outpt.write('MULTIPLE\n')

	def main(self):
		self.solve()
		self.outpt.close()

if __name__ == '__main__':
	p01872().main()