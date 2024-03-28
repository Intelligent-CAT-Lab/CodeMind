import sys

s = sys.stdin.readline().strip()

sd = "abcdefghijklmnopqrstuvwxyz"
sdnum = "0123456789"

count = [0] * 26
countnum = [0] * 10

for i in s:
	if i >= '0' and i <= '9':
		countnum[int(i)] += 1
	if i >= 'a' and i <= 'z':
		count[ord(i) - ord('a')] += 1

ans = 0
for i in range(26, 3, -1):
	for j in range(0, 26 - i + 1):
		tmp = 10000
		for k in range(j, j + i):
			tmp = min(tmp, count[k])
		ans += tmp * 3
		for k in range(j, j + i):
			count[k] -= tmp

for i in range(0, 26):
	ans += count[i]

for i in range(10, 3, -1):
	for j in range(0, 10 - i + 1):
		tmp = 10000
		for k in range(j, j + i):
			tmp = min(tmp, countnum[k])
		ans += tmp * 3
		for k in range(j, j + i):
			countnum[k] -= tmp

for i in range(0, 10):
	ans += countnum[i]

print(ans)