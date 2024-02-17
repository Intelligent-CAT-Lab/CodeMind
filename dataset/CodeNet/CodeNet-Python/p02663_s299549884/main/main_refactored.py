class main:
	import sys
	import math
	from  collections import defaultdict
	
	# sys.stdin = open('input.txt', 'r')
	# sys.stdout = open('output.txt', 'w')
	
	def solve(test):
		h1, m1, h2, m2, k = list(map(int, input().split()))
		r1 = h1 * 60 + m1
		r2 = h2 * 60 + m2
		ans = max(0, r2 - r1 - k)
		print(ans)
	
	if __name__ == "__main__":
		test_cases = 1
		for t in range(1, test_cases + 1):
			solve(t)
