def f(keys, value):
    d = dict.fromkeys(keys, value)	## d = CLRJ | keys = CLRJ | value = CLRJ
    for i, k in enumerate(d.copy(), 1):	## i = CLRJ | k = CLRJ | d = CLRJ
        if d[k] == d[i]:	## d = CLRJ | k = CLRJ | i = CLRJ
            del d[i]	## d = CLRJ | i = CLRJ
    return d	## d = CLRJ
