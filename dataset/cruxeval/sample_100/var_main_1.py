def f(d, rm):
    res = d.copy()	## res = CLRJ | d = CLRJ
    for k in rm:	## k = CLRJ | rm = CLRJ
        if k in res:	## k = CLRJ | res = CLRJ
            del res[k]	## res = CLRJ | k = CLRJ
    return res	## res = CLRJ
