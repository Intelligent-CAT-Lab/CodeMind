class main:
	n=int(eval(input()))
	m=(1<<32)-1
	
	print(("{:032b}".format(n)))
	print(("{:032b}".format(~n&m)))
	print(("{:032b}".format(n<<1&m)))
	print(("{:032b}".format(n>>1)))
