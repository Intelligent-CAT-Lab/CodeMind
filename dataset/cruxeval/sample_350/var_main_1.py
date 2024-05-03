def f(d):
    size = len(d)	## size = CLRJ | d = CLRJ
    v = [0] * size	## v = CLRJ | size = CLRJ
    if size == 0:	## size = CLRJ
        return v
    for i, e in enumerate(d.values()):	## i = CLRJ | e = CLRJ | d = CLRJ
        v[i] = e	## v = CLRJ | i = CLRJ | e = CLRJ
    return v	## v = CLRJ
