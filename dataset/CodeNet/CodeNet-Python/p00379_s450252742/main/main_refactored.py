class main:
	a, n, m = list(map(int, input().split()))
	ans = 0
	for i in range(a, int(m ** (1 / 2)) + 1):
	  x = i ** n
	  if not 1 <= x <= m:
	    continue
	  y = i - a
	  if sum(map(int, list(str(x)))) == y:
	    ans += 1
	print(ans)
