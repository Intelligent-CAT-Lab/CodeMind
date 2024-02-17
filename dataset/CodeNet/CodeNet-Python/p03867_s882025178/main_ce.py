M=10**9+7;D=[];i=1;r=0;N,K=map(int,"4 2".split())
while i*i<=N:
	if N%i==0:D.append(i);i*i<N and D.append(N/i)
	i+=1
D.sort();N=[]
for i in range(len(D)):
	N.append(pow(K,-~D[i]/2,M))
	for j in range(i):
		if D[i]%D[j]==0:N[i]=(N[i]-N[j])%M
	r=(r+(N[i]*D[i]*pow(2,M-2+D[i]%2,M)))%M
print r