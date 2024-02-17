class main:
	input_line = input().split()
	
	a = int(input_line[0])
	b = int(input_line[1])
	c = int(input_line[2])
	
	if( (a<b)and(b<c) ):
		print('Yes')
	else:
		print('No')