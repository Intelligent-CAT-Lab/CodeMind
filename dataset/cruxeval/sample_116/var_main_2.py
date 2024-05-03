def f(d, count):
    for i in range(count):	## i = [] | count = []
        if d == {}:	## d = []
            break
        d.popitem()
    return d	## d = []
