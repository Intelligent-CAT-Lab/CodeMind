a,b,c,d = map(int, "1 1 3 4".split())
x = abs(c-a)
y = abs(d-b)
if x == 0 or y == 0:
	print 0
	import sys
	sys.exit(0)
def gcd(a,b):
	return a if b == 0 else gcd(b, a % b)
e = gcd(x,y)
x /= e
y /= e
print (x+y-1) * e