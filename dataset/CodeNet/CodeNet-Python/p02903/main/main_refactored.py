class main:
	h,w,a,b = list(map(int,input().split()))
	for i in range(h):
	    if i < b:
	        print(("".join(["0"]*a+["1"]*(w-a))))
	    else:
	        print(("".join(["1"]*a+["0"]*(w-a))))
