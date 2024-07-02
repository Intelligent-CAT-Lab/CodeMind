def f(d, l):
	new_d = {}

	for k in l:
		if d.get(k) is not None:
			new_d[k] = d[k]

	return new_d.copy()
f({"lorem ipsum" : 12, "dolor" : 23}, ["lorem ipsum", "dolor"])