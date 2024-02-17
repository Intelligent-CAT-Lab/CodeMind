class main:
	a=[0]*100
	b=list(map(int,input().split()))
	for i in range(12):
	    a[b[i]-1]+=1
	c=0
	for i in range(100):
	    if a[i] and a[i]%4==0: c+=a[i]//4
	print(('yes' if c==3 else 'no'))