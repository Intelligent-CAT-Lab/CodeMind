class main:
	#D問題
	#D問題
	import math
	N=int(eval(input()))
	n=int(math.sqrt(N))
	plist=[]
	for i in range(1,n+1):
	    if N%i == 0:
	        plist.append(i)
	        if i != int(N/i):
	            plist.append(int(N/i))
	ans=0
	for i in range(len(plist)):
	    x=plist[i]
	    kari=int(N/x)-1
	    if kari == 0:
	        pass
	    else:
	        q=int(N/kari)
	        r=N%kari
	        if q == r:
	            ans+=kari
	print(ans)
	            
