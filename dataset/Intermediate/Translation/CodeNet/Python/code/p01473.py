from math import factorial as f
S = raw_input()
lS = len(S)
d = [S.count(i) for i in set(list(S))]
dd = sum([i%2 for i in d])
if (lS%2 == 0 and dd != 0 ) or (lS%2 == 1 and dd != 1): 
		print 0
else:
	dnm = 1
	for i in d:
		dnm *= f(i/2)
	print f(lS/2)/dnm