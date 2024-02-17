class main:
	def gcd(x, y):
	    if y == 0:
	        return x
	    else:
	        return gcd(y,x%y)
	
	a,b,k = list(map(int,input().split()))
	ans = gcd(a,b)
	cnt = 1
	while cnt < k:
	    ans -= 1
	    if a % ans == 0 and b % ans == 0:
	        cnt += 1
	print(ans)