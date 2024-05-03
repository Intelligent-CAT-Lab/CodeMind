def f(a):
    s = dict(list(a.items())	## {"s" : '',"a" : ''}
    [::-1])
    return " ".join([str(i) for i in s.items()])	## {"i" : '',"s" : ''}
