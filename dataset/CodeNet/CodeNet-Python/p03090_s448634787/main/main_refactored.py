class main:
	N=int(eval(input()))
	A=[]
	B=[]
	if N%2==0:
	  for i in range(1,N):
	    for j in range(i+1,N+1):
	      A.append((i,j))
	  for i in range(N//2):
	    B.append((i+1,N-i))
	  D=set(A)-set(B)
	  print((len(D)))
	  for a,b in D:
	    print((a,b))
	else:
	  for i in range(1,N):
	    for j in range(i+1,N+1):
	      A.append((i,j))
	  for i in range(N//2):
	    B.append((i+1,N-i-1))
	  D=set(A)-set(B)
	  print((len(D)))
	  for a,b in D:
	    print((a,b))