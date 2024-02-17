import sys
s = "1111"
n = len(s)
if s[0] == "0" or s[-1] == "1":
	print(-1)
	sys.exit()
possible = []
for i in range(n // 2):
	if s[i] != s[n - i - 2]:
		print(-1)
		sys.exit()
	if i > 0 and s[i] == "1":
		possible.append(i+1)
#print(possible)
l = len(possible)
edges = []
cnt = 0
for i in range(l):
	for j in range(cnt + 1, possible[i]):
		edges.append([j, possible[i]])
	if i != l - 1:
		edges.append([possible[i], possible[i+1]])
	else:
		edges.append([possible[i], possible[i] + 1])
	cnt = possible[i]
for i in range(cnt + 2, n + 1):
	edges.append([cnt + 1, i])
for e in edges:
	print(*e)
