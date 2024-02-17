class main:
	n=int(eval(input()))
	print((1000-n%1000 if n%1000!=0 else 0))