N = int(input())

l = [1] + [6 ** x for x in range(1, 7)] + [9 ** x for x in range(1, 6)]
l.sort()

INF = 10 ** 3
dp = [0] + [INF] * N

for n in range(1, N + 1):
	#for f in [1, 6, 9, 6 ** 2, 9 ** 2, 6 ** 3, 9 ** 3]:
	for f in l:
		if 0 <= n - f:
			dp[n] = min([dp[n], dp[n - f] + 1])
			#print(dp)
print(dp[-1])
