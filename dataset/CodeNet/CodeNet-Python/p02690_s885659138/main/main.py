n=int(eval(input()))
for i in range(int(pow(n,1/5))+100):
	a=i
	b=-1*(n-pow(a,5))

	c=int(pow(abs(b),1/5))
	if b<0:
		c=-c
	if c*c*c*c*c==b:
		print((a,c))
		exit()