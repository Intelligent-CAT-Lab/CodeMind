class main:
	def cal(n): return n*(n+1)//2
	
	x=int(eval(input()))
	ans=[1,cal(x)]
	a=0
	while 1:
	    a+=1
	    tmp=cal(sum(ans)//2)
	    if tmp>x:
	        ans[1]=sum(ans)//2
	    elif tmp<x:
	        ans[0]=sum(ans)//2
	    elif tmp==x:
	        print((sum(ans)//2))
	        break
	    if ans[1]-ans[0]==1:
	        print((ans[1]))
	        break