N=input()

E=[ [ "" for j in range(N+1) ] for i in range(N+1) ]

for K in range(10):
	if N<=2**K:
		break

for i in range(1,N+1):
	for j in range(i+1,N+1):
			for k in range(K):
				if (i>>k)&1!=(j>>k)&1:
						E[i][j]=k+1
						break
	
for i in range(1,N):
	s=""
	for j in range(i+1,N+1):
		s+=str(E[i][j])+" "
	print s