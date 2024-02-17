class main:
	a,b,c=list(map(str,input().split()))
	if a[-1]==b[0] and b[-1]==c[0]:
	    print("YES")
	else:
	    print("NO")