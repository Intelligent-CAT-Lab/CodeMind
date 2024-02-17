def s(n):
	return sum([ord(x)-ord('0') for x in str(n)])
def r(n):
	return n/s(n)
def f(n):
	d = 10
	m = n
	while d <= n*10:
		n //= d
		n *= d
		n += d-1
		d *= 10
		if(r(n) < r(m)):
			m = n
	return m
n = 1
for _ in range(int("10")):
	print(n)
	n = f(n+1)