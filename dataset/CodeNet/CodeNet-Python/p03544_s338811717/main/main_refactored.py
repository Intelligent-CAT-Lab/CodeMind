class main:
	n=int(eval(input()))
	a=[2,1]
	for i in range(n-1):
	    a.append(a[len(a)-2]+a[len(a)-1])
	print((a[len(a)-1]))