MOD = 1000000007
mb = {}
def f(n):
	if n <= 2:
		return n
	if n in mb:
		return mb[n]
	res = f(n/2) + f((n-1)/2) + f((n+1)/2)
	res %= MOD
	mb[n] = res
	return res

n = int(raw_input())
print f(n+1)