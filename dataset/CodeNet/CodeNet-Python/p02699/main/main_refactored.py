class main:
	s, w = list(map(int, input().split()))
	
	if w >= s :
	    print("unsafe")
	else:
	    print("safe")