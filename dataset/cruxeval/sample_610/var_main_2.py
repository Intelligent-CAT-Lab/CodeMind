def f(keys, value):
    d = dict.fromkeys(keys, value)	## d = [] | keys = [] | value = []
    for i, k in enumerate(d.copy(), 1):	## i = [] | k = [] | d = []
        if d[k] == d[i]:	## d = [] | k = [] | i = []
            del d[i]	## d = [] | i = []
    return d	## d = []
