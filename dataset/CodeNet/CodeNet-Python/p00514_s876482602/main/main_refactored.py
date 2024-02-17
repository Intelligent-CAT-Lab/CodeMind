class main:
	n,m,r=list(map(int,input().split()));
	a=n+r-n*m-1;b=r-n*m;
	s=1;
	if a<b or a<0 or b<0:s=0;
	else:
	    if b>a-b:b=a-b;
	    for i in range(b):s=s*(a-i)//(i+1);
	print(s)
