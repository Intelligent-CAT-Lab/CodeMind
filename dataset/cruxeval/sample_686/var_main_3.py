def f(d, l):
	new_d = {}	## <state>new_d = CLRJ</state>

	for k in l:	## <state>k = CLRJ | l = CLRJ</state>
		if d.get(k) is not None:	## <state>d = CLRJ | k = CLRJ</state>
			new_d[k] = d[k]	## <state>new_d = CLRJ | k = CLRJ | d = CLRJ</state>

	return new_d.copy()	## <state>new_d = CLRJ</state>
