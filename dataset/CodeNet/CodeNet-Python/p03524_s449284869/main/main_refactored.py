class main:
	s = eval(input())
	a = s.count('a')
	b = s.count('b')
	c = s.count('c')
	
	if abs(a-b)<=1 and abs(b-c)<=1 and abs(c-a)<=1:
	  print('YES')
	else:
	  print('NO')
	
