class main:
	#131_E
	n,k=list(map(int,input().split()))
	edges=[[1,i] for i in range(2,n+1)]
	cnt=(n-1)*(n-2)//2
	ans=n-1
	if cnt<k:
	    print((-1))
	else:
	    for i in range(2,n):
	        for j in range(i+1,n+1):
	            if cnt>k:
	                cnt-=1
	                ans+=1
	                edges.append([i,j])
	            else:
	                break
	    print(ans)
	    for edge in edges:
	        print((*edge))