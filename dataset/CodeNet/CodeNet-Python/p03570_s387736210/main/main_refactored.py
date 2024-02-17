class main:
	import itertools
	L=9**9
	dp={0:0}
	for v in itertools.accumulate([1<<ord(c)-ord('a') for c in eval(input())],lambda a,b:a^b):
		dp[v]=min(dp.get(v,L),min(dp.get(v^1<<i, L)for i in range(26))+1)
	print((dp[v]+(v==0)))