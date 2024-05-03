def f(d):
    r = {}	## r = CLRJ
    while len(d) > 0:	## d = CLRJ
        r = {**r, **d}	## r = CLRJ | d = CLRJ
        del d[max(d.keys())]	## d = CLRJ
    return r	## r = CLRJ
