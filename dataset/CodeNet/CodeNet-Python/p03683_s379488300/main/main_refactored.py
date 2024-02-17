class main:
	from math import factorial
	n, m = list(map(int, input().split()))
	mod = 10 ** 9 + 7
	if abs(n - m) > 1:
	    print((0))
	else:
	    if (n + m) % 2 == 0:
	        ans = factorial(n) * factorial(m) * 2 % mod
	    else:
	        ans = factorial(n) * factorial(m) % mod
	    print(ans)