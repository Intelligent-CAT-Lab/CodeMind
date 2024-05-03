def f(bag):
    values = list(bag.values())	## values = CLRJ | bag = CLRJ
    tbl = {}	## tbl = CLRJ
    for v in range(100):	## v = CLRJ
        if v in values:	## v = CLRJ | values = CLRJ
            tbl[v] = values.count(v)	## tbl = CLRJ | v = CLRJ | values = CLRJ
    return tbl	## tbl = CLRJ
