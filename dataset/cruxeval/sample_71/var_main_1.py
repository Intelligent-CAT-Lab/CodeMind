def f(d, n):
    for i in range(n):	## i = CLRJ | n = CLRJ
        item = d.popitem()	## item = CLRJ | d = CLRJ
        d[item[1]] = item[0]	## d = CLRJ | item = CLRJ
    return d	## d = CLRJ
