class main:
	a, b, c = list(map(int, input().split()))
	t = 0
	for loop in range(61):
	    if t % 60 <= c <= t % 60 + a:
	        print(t / 60 * 60 + c)
	        break
	    t += a + b
	else:
	    print(-1)