class main:
	a, b, c, k = list(map(int, input().split()))
	ans = 0
	ans += 1*( min(a, k) )
	k -= min(a, k)
	ans += 0*( min(b, k) )
	k -= min(b, k)
	ans += (-1)*( min(c, k) )
	k -= min(c, k)
	print(ans)