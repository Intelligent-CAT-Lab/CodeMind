def f(d, l):
	new_d = {}	## new_d = []

	for k in l:	## k = [] | l = []
		if d.get(k) is not None:	## d = [] | k = []
			new_d[k] = d[k]	## new_d = [] | k = [] | d = []

	return new_d.copy()	## new_d = []
