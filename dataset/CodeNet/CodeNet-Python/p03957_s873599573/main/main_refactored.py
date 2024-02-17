class main:
	s = list(eval(input()))
	a = 0
	b = 0
	for i in range(len(s)):
	  if s[i] == 'C':
	    a = 1
	  if s[i] == 'F' and a == 1:
	    b = 1
	print((['No', 'Yes'][b]))