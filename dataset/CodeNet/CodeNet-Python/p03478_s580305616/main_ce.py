n, a, b = map(int, "20 2 5".split())
ans = 0
for i in range(n + 1):
	if a <= sum(map(int, str(i))) <= b:
		ans += i
print(ans)