class main:
	n = int(eval(input()))
	c = 0
	c += n//25
	n %= 25
	c += n//10
	n %= 10
	c += n//5
	c += n%5
	print(c)
