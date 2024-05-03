def f(c, st, ed):
    d = {}	## d = CLRJ
    a, b = 0, 0	## a = CLRJ | b = CLRJ
    for x, y in c.items():	## x = CLRJ | y = CLRJ | c = CLRJ
        d[y] = x	## d = CLRJ | y = CLRJ | x = CLRJ
        if y == st:	## y = CLRJ | st = CLRJ
            a = x	## a = CLRJ | x = CLRJ
        if y == ed:	## y = CLRJ | ed = CLRJ
            b = x	## b = CLRJ | x = CLRJ
    w = d[st]	## w = CLRJ | d = CLRJ | st = CLRJ
    return (w, b) if a > b else (b, w)	## a = CLRJ | b = CLRJ | w = CLRJ
