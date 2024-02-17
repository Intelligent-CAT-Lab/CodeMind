class main:
	N,A,B = list(map(int,input().split()))
	if (A-B)%2==0:
	  print(((B-A)//2))
	else:
	  print((min(A-1,N-B)+1+(B-A)//2))