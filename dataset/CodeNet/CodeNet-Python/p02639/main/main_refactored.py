class main:
	x_list = list(map(int, input().split()))
	for i in range(5):
	    if x_list[i] == 0:
	        print((i+1))