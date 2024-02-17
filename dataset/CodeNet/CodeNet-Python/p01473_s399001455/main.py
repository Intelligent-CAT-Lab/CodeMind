from math import factorial as f
S = raw_input()
L = len(S)
d = [S.count(i) for i in set(list(S))]
dd = sum([i%2 for i in d])
if (L%2 == 0 and dd != 0 ) or (L%2 == 1 and dd != 1): 
		print 0
else:
	ans = f(L/2)
	for i in d:
		ans /= f(i/2)
	print ans