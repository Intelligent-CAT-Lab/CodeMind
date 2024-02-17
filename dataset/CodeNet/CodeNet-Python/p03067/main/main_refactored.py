class main:
	a,b,c=list(map(int,input().split()))
	if a<c<b or a>c>b:
	  print('Yes')
	else:
	  print('No')