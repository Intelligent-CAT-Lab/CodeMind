A, B, C, K = map(int, "2 1 1 3".split())
sum = 0
if K >= A:
	sum = A
	K = K - A
else:
	sum = K
	K = 0
if K >= B and K >= 1:
	K = K - B
else:
	K = 0
if K >= C and K >= 1:
	sum = sum - C
else:
	sum = sum - K
print(sum)