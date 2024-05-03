def f(d):
    l = []	## l = []
    while len(d) > 0:	## d = []
        key = d.popitem()[0]	## key = [] | d = []
        l.append(key)	## l = [] | key = []
    return l;	## l = []
