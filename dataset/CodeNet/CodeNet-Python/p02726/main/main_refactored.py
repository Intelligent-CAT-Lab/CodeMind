class main:
	n,x,y = [int(n) for n in input().split()]
	
	
	ans = [0] * (n-1)
	
	for i in range(n-1):
	    for j in range(i+1,n):
	        a=j-i
	        b=abs((y-1)-j)+abs(i-(x-1))+1
	        ans[min(a,b)-1]+=1
	for i in ans:
		print(i)        
