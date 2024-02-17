class main:
	x=eval(input())
	A=x.split()
	S=[]
	L=[]
	for i in A:
	    s=A.count(i)
	    S.append(s)
	    l=len(i)
	    L.append(l)
	M=max(S)
	m=max(L)
	Y=S.index(M)
	y=L.index(m)
	print((A[Y],A[y]))
