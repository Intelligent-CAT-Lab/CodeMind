class main:
	import sys
	input = lambda : sys.stdin.readline().rstrip()
	sys.setrecursionlimit(max(1000, 10**9))
	write = lambda x: sys.stdout.write(x+"\n")
	
	
	n,m = list(map(int, input().split()))
	ans = -1
	for i in range(1,m+1):
	    if i*i>m+10:
	        break
	    if m%i==0:
	        if m//i>=n:
	            ans = max(ans, i)
	        if i>=n:
	            ans = max(ans, m//i)
	print(ans)