class main:
	a,b=(int(x) for x in input().split())
	
	if a<=100 and b<=100:
	    print(f"{a*b/3.305785:.4f}")
