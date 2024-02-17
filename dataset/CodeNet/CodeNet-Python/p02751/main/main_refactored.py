class main:
	n,m=list(map(int,input().split()))
	ans=[["1"]*(2**m-1) for _ in range(2**n-1)]
	for k in range(1,11):
	    for i in range(2**k,2**n,2**k):
	        for j in range(2**k,2**m,2**k):
	            if ans[i-1][j-1]=="1":
	                ans[i-1][j-1]="0"
	            else:
	                ans[i-1][j-1]="1"
	for i in range(2**n-1):
	    print(("".join(ans[i])))