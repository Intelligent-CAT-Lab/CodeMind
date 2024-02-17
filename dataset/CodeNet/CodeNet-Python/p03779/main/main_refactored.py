class main:
	#ABC056-C
	x = int(eval(input()))
	
	#2次方程式を解く
	t = int((-1+(1+8*x)**0.5)//2)
	
	if t * (t+1) // 2 >= x:
	    print(t)
	else:
	    print((t+1))