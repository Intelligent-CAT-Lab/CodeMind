class main:
	n,a=list(map(int,input().split()))
	ans=10**18
	for k in range(41):
	  l=0
	  r=n
	  while r-l!=1:
	    m=(r+l)//2
	    if m**(k+1)>=n:
	      r=m
	    else:
	      l=m
	  for m in range(k+2):
	    if (l**m)*(r**((k+1)-m))>=n:
	      ans=min(ans,k*a+l*m+r*((k+1)-m))
	print(ans)