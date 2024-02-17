class main:
	import itertools
	a = input().split()
	b = set(map(str,list(range(1,10))))
	n, c = [], 0
	for i in range(9):
	    if a[i] in b:b.remove(a[i])
	    else:n.append(i)
	for i in itertools.permutations(tuple(b)):
	    for j in range(len(n)):a[n[j]] = i[j]
	    if int(a[0]) + int(a[1] + a[2]) + int(a[3] + a[4] + a[5]) == int(a[6] + a[7] + a[8]):c += 1
	print(c)
