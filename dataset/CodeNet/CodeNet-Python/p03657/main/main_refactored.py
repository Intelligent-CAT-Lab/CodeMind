class main:
	# ABC067 A - Sharing Cookies
	a,b = list(map(int,input().split()))
	
	if a%3 == 0:
	    print('Possible')
	elif b%3 == 0:
	    print('Possible')
	elif (a+b)%3 == 0:
	    print('Possible')
	else:
	    print('Impossible')