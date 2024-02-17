class main:
	a,b=input().split()
	a_string=a*int(b)
	b_string=b*int(a)
	answer=sorted([a_string,b_string])
	print((answer[0]))