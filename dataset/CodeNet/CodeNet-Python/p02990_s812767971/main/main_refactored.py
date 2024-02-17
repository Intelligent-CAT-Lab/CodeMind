class main:
	from functools import reduce
	def nCr(n,r,DIV):
	  if r<n-r:
	    r=n-r
	  if r==0:
	    return 1
	  f=lambda x,y:x*y%DIV
	  X=reduce(f,list(range(n-r+1,n+1)))
	  Y=reduce(f,list(range(1,r+1)))
	  return X*pow(Y,DIV-2,DIV)%DIV
	
	n, k = list(map(int, input().split()))
	mod = pow(10, 9) + 7
	for i in range(k):
	    ans = -1
	    if i+1 > n-k+1:
	        ans = 0
	    else:
	        ans = (nCr(k - 1, i, mod) * nCr(n - k + 1, i + 1, mod)) % mod
	
	    print(ans)