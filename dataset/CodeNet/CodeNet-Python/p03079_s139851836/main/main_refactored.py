class main:
	A, B, C = (int(i) for i in input().strip().split(' '))
	
	if A == B and B == C:
	    print("Yes")
	else:
	    print("No")
