k = int(raw_input())
n = 50
a = [49] * n
c = k // n
for i in range(n):
	a[i] += c
c = k % n
for _ in range(c):
	mp = 0
	for i in range(n):
		if a[i] < a[mp]:
			mp = i
	for i in range(n):
		if i == mp:
			a[i] += n
		else:
			a[i] -= 1
print n
for i in range(n):
	print a[i],