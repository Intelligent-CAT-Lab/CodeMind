def f(d):
    d = d.copy()	## {"d" : ''}
    d.popitem()	## {"d" : ''}
    return d	## {"d" : ''}
