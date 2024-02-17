a, b = map(int, "2 16".split())
buf = a + b
if buf % 2 == 0:
	print(buf // 2)
else:
	print("IMPOSSIBLE")