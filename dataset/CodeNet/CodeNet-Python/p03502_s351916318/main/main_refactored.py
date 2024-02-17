class main:
	N = eval(input())
	sum_Ndig =sum(map(int,N))
	print(( 'Yes' if int(N) % sum_Ndig ==0 else 'No'))