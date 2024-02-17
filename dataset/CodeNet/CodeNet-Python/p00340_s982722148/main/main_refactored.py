class main:
	a,b,c,d=list(map(int,input().split()))
	if a==b and c==d:
	    print('yes')
	elif a==c and b==d:
	    print('yes')
	elif a==d and b==c:
	    print('yes')
	else:
	    print('no')
	
