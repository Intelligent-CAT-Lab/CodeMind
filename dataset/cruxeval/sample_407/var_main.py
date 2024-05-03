def f(s):
    while len(s) > 1:	## {"s" : ''}
        s.clear()	## {"s" : ''}
        s.append(len(s))	## {"s" : ''}
    return s.pop()	## {"s" : ''}
