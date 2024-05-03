def f(sb):
    d = {}	## d = CLRJ
    for s in sb:	## s = CLRJ | sb = CLRJ
        d[s] = d.get(s, 0) + 1	## d = CLRJ | s = CLRJ
    return d	## d = CLRJ
