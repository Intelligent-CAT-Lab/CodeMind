class main:
	s = eval(input())
	print((sum(a != b for a, b in zip(s[1:], s[:-1]))))