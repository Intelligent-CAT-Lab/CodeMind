class main:
	s = eval(input())
	a = ""
	for i in s:
	  if i == "B":
	    if not(a == ""):
	      a = a[:-1]
	  else:
	    a += i
	print(a)