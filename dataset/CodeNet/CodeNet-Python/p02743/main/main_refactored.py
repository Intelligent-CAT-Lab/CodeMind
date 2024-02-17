class main:
	a,b,c = list(map(int,input().split()))
	if c-a-b < 0:
	    print('No')
	else:
	    print(('Yes' if 4*a*b < (c-a-b)**2 else 'No'))