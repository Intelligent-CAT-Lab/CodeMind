def f(sb):
    d = {}	## {"d" : ''}
    for s in sb:	## {"s" : '',"sb" : ''}
        d[s] = d.get(s, 0) + 1	## {"d" : '',"s" : ''}
    return d	## {"d" : ''}
