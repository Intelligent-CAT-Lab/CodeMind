class main:
	x,a,b=list(map(int,input().split()))
	if b<=a:
	  print('delicious')
	elif (b-a)<=x:
	  print('safe')
	else:
	  print('dangerous')