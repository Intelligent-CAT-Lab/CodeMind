class main:
	a = list(map(int,input().split()))
	N,K = a[0]-1,a[1]-1
	
	if N/2 >= K:
	    print("YES")
	else:
	    print("NO")