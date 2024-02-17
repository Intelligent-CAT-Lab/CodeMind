k = int("5")
l,r = 0,k
while (r-l)>1:
	m = (l+r)/2
	if (m * (m + 1)) < k:
		l = m
	else:
		r = m
b = l
#print b
ad = k - (b * (b + 1))
d = ((ad - 1) % (b + 1)) + 1
#print ad,d
x = 2 * b + 1
y = 1
if (ad - d) > 0:
	x += 1
	
if d  <= (b + 1 + 1) / 2:
	dd = d * 2 - 1
else:
	dz = (b + 1 - d)
	dd = dz * 2 + 2
x -= (dd-1)
y += (dd-1)
mod = 1000000007
def mul(a,b):
	res = [[0,0],[0,0]]
	p,q,r = 2,2,2
	for s in xrange(p):
		for t in xrange(q):
			res[s][t] = 0
			for u in xrange(r):
				y = a[s][u] * b[u][t]
				res[s][t] += y
			res[s][t] %= mod
	return res
def fib(x):
	bt = [[1,1],[1,0]]
	r = [[1,1],[1,0]]
	while x > 0:
		if x % 2 != 0:
			r = mul(r,bt)
		bt = mul(bt,bt)
		x /= 2
	
	return r[0][0]
	
#print x,y
ans = fib(x-1) * fib(y-1)
ans %= mod
print ans