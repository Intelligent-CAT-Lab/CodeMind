class main:
	n = int(input()) + 1
	n = bin(n)[3:]
	ra = []
	rb = []
	c = 1
	for i in n:
	    ra.append(c)
	    rb.append(c)
	    c += 1
	    if i == '1':
	        ra = ra + [c]
	        rb = [c] + rb
	        c += 1
	res = ra + rb
	print(len(res))
	print(' '.join(map(str, res)))
