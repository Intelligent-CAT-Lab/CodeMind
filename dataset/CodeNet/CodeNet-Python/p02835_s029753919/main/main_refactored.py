class main:
	A,B,C = list(map(int,input().split()))
	if A+B+C > 21:
	  print('bust')
	else:
	  print('win')
