class main:
	from sys import stdin, stdout
	
	
	a, b, c, x, y = list(map(int, stdin.readline().split()))
	
	ans = 0
	if 2 * c <= a + b:
	    ans += min(x, y) * 2 * c
	    q = min(x, y)
	    x -= q
	    y -= q
	    
	    if x and 2 * c <= a:
	        ans += 2 * c * x
	    elif x:
	        ans += a * x
	    elif y and 2 * c <= b:
	        ans += 2 * c * y
	    else:
	        ans += b * y
	    
	else:
	    ans = x * a + y * b
	
	stdout.write(str(ans))