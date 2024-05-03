def f(c, st, ed):
    d = {}	## {"d" : ''}
    a, b = 0, 0	## {"a" : '',"b" : ''}
    for x, y in c.items():	## {"x" : '',"y" : '',"c" : ''}
        d[y] = x	## {"d" : '',"y" : '',"x" : ''}
        if y == st:	## {"y" : '',"st" : ''}
            a = x	## {"a" : '',"x" : ''}
        if y == ed:	## {"y" : '',"ed" : ''}
            b = x	## {"b" : '',"x" : ''}
    w = d[st]	## {"w" : '',"d" : '',"st" : ''}
    return (w, b) if a > b else (b, w)	## {"a" : '',"b" : '',"w" : ''}
