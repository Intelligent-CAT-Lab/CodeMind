def gcd(x,y):
	x, y = max(x,y), min(x,y)
	while(y):
		x, y = y, x%y
	return x
A,B,C,D = map(int,"4 9 2 3".split())
A -= 1
CD = C*D // gcd(C,D)
a = A - (A//C + A//D - A//CD)
b = B - (B//C + B//D - B//CD)
print(b-a)