class main:
	A,B,C,D = list(map(int,input().split()))
	while A>0 and C>0:
	    C -= B
	    if C<=0:
	        print("Yes")
	        break
	    A -= D
	    if A<=0:
	        print("No")
	        break