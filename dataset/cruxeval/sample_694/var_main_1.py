def f(d):
    i = len(d) - 1	## i = CLRJ | d = CLRJ
    key = list(d.keys())[i]	## key = CLRJ | d = CLRJ | i = CLRJ
    d.pop(key, None)	## d = CLRJ | key = CLRJ
    return key, d	## key = CLRJ | d = CLRJ
