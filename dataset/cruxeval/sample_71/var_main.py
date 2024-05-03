def f(d, n):
    for i in range(n):	## {"i" : '',"n" : ''}
        item = d.popitem()	## {"item" : '',"d" : ''}
        d[item[1]] = item[0]	## {"d" : '',"item" : ''}
    return d	## {"d" : ''}
