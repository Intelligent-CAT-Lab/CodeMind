def f(bag):
    values = list(bag.values())	## {"values" : '',"bag" : ''}
    tbl = {}	## {"tbl" : ''}
    for v in range(100):	## {"v" : ''}
        if v in values:	## {"v" : '',"values" : ''}
            tbl[v] = values.count(v)	## {"tbl" : '',"v" : '',"values" : ''}
    return tbl	## {"tbl" : ''}
