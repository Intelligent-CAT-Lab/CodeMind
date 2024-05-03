def f(d):
    r = {}	## {"r" : ''}
    while len(d) > 0:	## {"d" : ''}
        r = {**r, **d}	## {"r" : '',"d" : ''}
        del d[max(d.keys())]	## {"d" : ''}
    return r	## {"r" : ''}
