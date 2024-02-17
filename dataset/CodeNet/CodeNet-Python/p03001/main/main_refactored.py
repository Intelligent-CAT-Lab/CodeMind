class main:
	w,h,x,y = list(map(float,input().split()))
	mx,my = w/2,h/2
	res= []
	res.append(w*h/2)
	if x==mx and y==my:
	    res.append(1)
	else:
	    res.append(0)
	print((res[0],res[1]))