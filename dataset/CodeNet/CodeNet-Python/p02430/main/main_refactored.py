class main:
	import itertools
	
	n, k = list(map(int, input().split()))
	
	l = list(range(n))
	combs = list(itertools.combinations(l, k))
	
	sumlist = []
	for comb in combs:
	    sum = 0
	    for c in comb:
	        sum += pow(2, c)
	    sumlist.append(sum)
	
	z = list(zip(sumlist, combs))
	z = sorted(z)
	
	sumlist, combs = list(zip(*z))
	
	for sum, comb in zip(sumlist, combs):
	    c_str = (' '.join(str(c) for c in comb))
	    print((str(sum) + ": " + c_str))
