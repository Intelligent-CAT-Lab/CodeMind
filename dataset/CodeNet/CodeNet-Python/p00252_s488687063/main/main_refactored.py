class main:
	b1,b2,b3 = list(map(int,input().split()))
	
	if b1 == 1:
	    if b2 == 1:
	        print("Open")
	    else:
	        print("Close")
	else:
	    if b2 == 1:
	        print("Close")
	    else:
	        if b3 == 1:
	            print("Open")
	        else:
	            print("Close")
