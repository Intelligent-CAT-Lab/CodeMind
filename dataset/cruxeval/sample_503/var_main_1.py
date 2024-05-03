def f(d):
    result = [None] * len(d)	## result = CLRJ | d = CLRJ
    a = b = 0	## a = CLRJ | b = CLRJ
    while d:	## d = CLRJ
        result[a] = d.popitem(a == b)
        a, b = b, (b+1) % len(result)
    return result	## result = CLRJ
