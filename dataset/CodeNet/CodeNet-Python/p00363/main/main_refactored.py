class main:
	w,h,c=input().split(" ")
	w=int(w)
	h=int(h)
	print(("+"+"-"*(w-2)+"+"))
	for i in range(h-2):
	    if i*2==h-3:
	        print(("|"+"."*((w-3)//2)+c+"."*((w-3)//2)+"|"))
	    else:
	        print(("|"+"."*(w-2)+"|"))
	print(("+"+"-"*(w-2)+"+"))
