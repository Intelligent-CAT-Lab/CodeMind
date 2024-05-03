def f(d):
    result = [None] * len(d)	## result = [] | d = []
    a = b = 0	## a = [] | b = []
    while d:	## d = []
        result[a] = d.popitem(a == b)
        a, b = b, (b+1) % len(result)
    return result	## result = []
