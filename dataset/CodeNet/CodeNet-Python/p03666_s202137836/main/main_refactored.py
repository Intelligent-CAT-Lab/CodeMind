class main:
	n, a, b, c, d = list(map(int, input().split()))
	a, b = 0, b - a
	segs = [[-d * (n - 1), -c * (n - 1)]]
	for _ in range(n - 1):
		segs.append([segs[-1][0] + c + d, segs[-1][1] + c + d])
	ok = False
	for i in range(n):
		if segs[i][0] <= b <= segs[i][1]:
			ok = True
	if ok:
		print("YES")
	else:
		print("NO")