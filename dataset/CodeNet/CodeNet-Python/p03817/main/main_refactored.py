class main:
	x=int(eval(input()))
	
	ans=0
	q,r=divmod(x,11)
	ans+=2*q
	q,r=divmod(r,6)
	ans+=q
	if r>0:
	  ans+=1
	print(ans)
