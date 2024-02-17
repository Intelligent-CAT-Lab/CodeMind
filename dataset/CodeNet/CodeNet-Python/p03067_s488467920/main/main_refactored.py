class main:
	A,B,C = list(map(int,input().split()))
	if A < C < B or A > C > B:
	    print('Yes')
	else:
	    print('No')