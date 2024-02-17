class main:
	n, m = [int(item) for item in input().split()]
	# Enough s
	if n * 2 >= m:
	    print((m//2))
	# Enough m 
	else:
	    amari = m - n*2
	    print((amari//4 + n))