class main:
	import fractions
	a,b,c,d=list(map(int,input().split()))
	c=abs(c-a)
	d=abs(d-b)
	g=fractions.gcd(max(c,d),min(c,d))
	j=int(c/g)
	k=int(d/g)
	print(((j+k-1)*g))