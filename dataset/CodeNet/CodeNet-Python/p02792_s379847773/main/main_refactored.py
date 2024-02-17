class main:
	N = int(eval(input()))
	count = [[0] * 10 for _ in range(10)]
	for i in range(1, N + 1):
	    s = str(i)
	    count[int(s[0])][int(s[-1])] += 1
	ans = sum(count[i][j] * count[j][i] for i in range(1, 10) for j in range(1, 10))
	print(ans)
