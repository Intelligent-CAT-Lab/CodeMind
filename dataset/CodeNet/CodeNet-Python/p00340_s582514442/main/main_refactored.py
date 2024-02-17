class main:
	e1,e2,e3,e4=list(map(int,input().split()))
	
	if e1==e2 and e3==e4:
	    print('yes')
	elif e1==e3 and e2==e4:
	    print('yes')
	elif e1==e4 and e2==e3:
	    print('yes')
	elif e1==e2==e3==e4:
	    print('yes')
	else:
	    print('no')
