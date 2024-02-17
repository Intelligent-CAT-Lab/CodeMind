class main:
	a, b, c = list(map(int, input().split()))
	if c >= a and c <= b:
	    print('Yes')
	else:
	    print('No')
