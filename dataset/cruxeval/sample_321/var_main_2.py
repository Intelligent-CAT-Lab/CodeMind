def f(update, starting):
    d = starting.copy()	## d = [] | starting = []
    for k in update:	## update = []
        if k in d:
            d[k] += update[k]
        else:
            d[k] = update[k]
    return d	## d = []
