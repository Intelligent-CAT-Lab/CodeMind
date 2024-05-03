def f(seq, v):
    a = []	## {"a" : ''}
    for i in seq:	## {"i" : '',"seq" : ''}
        if i.endswith(v):	## {"i" : '',"v" : ''}
            a.append(i*2)	## {"a" : '',"i" : ''}
    return a	## {"a" : ''}
