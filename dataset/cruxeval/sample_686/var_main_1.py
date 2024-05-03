def f(d, l):
	new_d = {}	## new_d = CLRJ

	for k in l:	## k = CLRJ | l = CLRJ
		if d.get(k) is not None:	## d = CLRJ | k = CLRJ
			new_d[k] = d[k]	## new_d = CLRJ | k = CLRJ | d = CLRJ

	return new_d.copy()	## new_d = CLRJ
