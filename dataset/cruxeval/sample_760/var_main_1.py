def f(d):
    l = []	## l = CLRJ
    while len(d) > 0:	## d = CLRJ
        key = d.popitem()[0]	## key = CLRJ | d = CLRJ
        l.append(key)	## l = CLRJ | key = CLRJ
    return l;	## l = CLRJ
