import math

def solve():
	n = int(input())
	k = int(input())
	k -= 1
	sins = [0.0] * (n+1)
	for i in range(n+1):
		sins[i] = math.sin(2*math.pi*i/n)/2

	low = 0
	high = 2*math.pi
	for rep in range(50):
		h = (low+high)/2
		if count(h, n) <= k:
			low = h
		else:
			high = h
	print("%.14f" % high)

def count(h, n):
	ret = 0
	for len in range(1, n-1):
		low = 0
		high = (n-len)//2+1
		while high-low > 1:
			q = (high+low)//2
			if S(len, q, n-len-q) <= h:
				low = q
			else:
				high = q
		ret += low*2
		if low == (n-len)//2 and (n-len)%2 == 0:
			ret -= 1
	assert ret*n % 3 == 0
	return ret*n//3

def S(a, b, c):
	return sins[a]+sins[b]+sins[c]

if __name__ == '__main__':
	solve()