def f(a, b):
    d = dict(zip(a, b))	## {"d" : '',"a" : '',"b" : ''}
    a.sort(key=d.get, reverse=True)	## {"a" : '',"d" : ''}
    return [d.pop(x) for x in a]	## {"d" : '',"x" : '',"a" : ''}
