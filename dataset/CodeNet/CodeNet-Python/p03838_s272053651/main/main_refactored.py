class main:
	x,y=list(map(int,input().split()))
	if x*y >0:
	  k=2
	else:
	  k=1
	if x==y:
	  print((0))
	if x==0 and y<0:
	  print((abs(y)+1))
	
	elif x<y:
	  if k==2 or x==0:
	    print((y-x))
	  elif y == 0:
	    print((abs(x)))
	  else:
	    print((abs(abs(y)-abs(x))+k))
	else:
	  if y==0 and x<0:
	    print((abs(x)))
	  else:
	    print((abs(abs(y)-abs(x))+k))
