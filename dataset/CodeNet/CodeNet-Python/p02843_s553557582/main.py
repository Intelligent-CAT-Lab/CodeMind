n = int(input())
f = [0]*(n+1)
f[0] = 1
for x in range(1, n+1):
	for i in range(100, 106):
		if x-i >= 0 and f[x-i] == 1:
			f[x] = 1
print(f[n])