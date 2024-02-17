class main:
	a,b,c = list(map(int, input().split()))
	if (b - a) == (c - b):
	    print("YES")
	else:
	    print("NO")
