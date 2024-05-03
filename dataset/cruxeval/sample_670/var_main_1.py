def f(a, b):
    d = dict(zip(a, b))	## d = CLRJ | a = CLRJ | b = CLRJ
    a.sort(key=d.get, reverse=True)	## a = CLRJ | d = CLRJ
    return [d.pop(x) for x in a]	## d = CLRJ | x = CLRJ | a = CLRJ
