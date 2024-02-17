class main:
	import collections
	n=int(eval(input()))
	cnt=[]
	for x in range(1,101):
	  for y in range(1,101):
	    for z in range(1,101):
	      a=x**2+y**2+z**2+x*y+y*z+z*x
	      if a<=n:
	        cnt.append(a)
	c=collections.Counter(cnt)
	for i in range(1,n+1):
	  print((c[i]))