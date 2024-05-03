def f(d, index):
    length = len(d.items())	## {"length" : '',"d" : ''}
    idx = index % length	## {"idx" : '',"index" : '',"length" : ''}
    v = d.popitem()[1]	## {"v" : '',"d" : ''}
    for _ in range(idx):	## {"idx" : ''}
        d.popitem()
    return v	## {"v" : ''}
