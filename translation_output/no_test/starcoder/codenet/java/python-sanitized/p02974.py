import sys

def solve():
	n, k = map(int, raw_input().split())
	if k % 2 == 1:
		print 0
		return
	mod = 1000000007
	dp = [[0 for i in xrange(2*n*n+1)] for j in xrange(n+1)]
	dp[0][n*n] = 1
	for i in xrange(1, n+1):
		ndp = [[0 for i in xrange(2*n*n+1)] for j in xrange(n+1)]
		for j in xrange(n+1):
			for k in xrange(2*n*n+1):
				if dp[j][k] == 0:
					continue
				# add source
				if j+1 <= n and k-i >= 0:
					ndp[j+1][k-i] += dp[j][k]
					nd