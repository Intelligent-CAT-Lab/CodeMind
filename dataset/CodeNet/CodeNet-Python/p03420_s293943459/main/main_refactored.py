class main:
	import sys
	input = lambda : sys.stdin.readline().rstrip()
	sys.setrecursionlimit(max(1000, 10**9))
	write = lambda x: sys.stdout.write(x+"\n")
	
	
	n,k = list(map(int, input().split()))
	ans = 0
	for b in range(k+1, n+1):
	    val = (b-k) * (n//b) + max(0, (n%b)-k+1)
	    if k==0:
	        val -= 1
	    ans += val
	#     print(b,val)
	print(ans)