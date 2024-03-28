import sys

mod = 1000000007
memo = [1,1,1,1,1,1,1,1,1]

def makeMemo():
	for i in range(2,9):
		for bit in range(2**(i-2)):
			before = 0
			for j in range(9):
				now = (bit>>j&1)
				if before==1 and now==1:
					break
				before = now
				if j==8:
					memo[i]+=1

def solve(H,W,K):
	dp = [[0]*W for _ in range(H+1)]
	dp[0][0]=1
	for h in range(H):
		for w in range(W):
			#å³
			if w+1<W:
				dp[h+1][w+1] += dp[h][w]*memo[w]*memo[W-1-w]
				dp[h+1][w+1] %= mod
			#å·¦
			if w-1>=0:
				dp[h+1][w-1] += dp[h][w]*memo[w-1]*memo[W-1-w]
				dp[h+1][w-1] %= mod
			#ä¸
			dp[h+1][w] += dp[h][w]*memo[w]*memo[W-1-w]
			dp[h+1][w] %= mod
	return dp[H][K-1]

def main():
	makeMemo()
	H,W,K = map(int,raw_input().split())
	print solve(H,W,K)

if __name__ == '__main__':
	main()