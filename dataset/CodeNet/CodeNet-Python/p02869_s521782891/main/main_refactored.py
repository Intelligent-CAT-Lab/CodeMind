class main:
	n, k = list(map(int, input().split()))
	s1, s2, s3, s4, s5, s6 = k, k+n-1, k+n, k+2*n-1, k+2*n, k+3*n-1
	if s1 + s4 <= (s5 + s6)/2:
	  for i in range(n//2+n%2):
	    a = s1 + i*2
	    b = s4 - i
	    c = s5 + n//2 + i
	    print((a, b, c))
	  for i in range(n//2):
	    a = s1 + 1 + i*2
	    b = s4 - (n+1)//2 - i
	    c = s5 + i
	    print((a, b, c))
	else:
	  print((-1))