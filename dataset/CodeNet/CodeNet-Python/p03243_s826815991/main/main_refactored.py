class main:
	N = int(eval(input()))
	l = [111,222,333,444,555,666,777,888,999]
	if N <= 111:
	    print((111))
	else:
	  for i in range(8):
	    if l[i] < N <= l[i+1]:
	      print((l[i+1]))
	      exit()