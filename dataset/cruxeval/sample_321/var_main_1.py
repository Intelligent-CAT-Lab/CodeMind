def f(update, starting):
    d = starting.copy()	## d = CLRJ | starting = CLRJ
    for k in update:	## update = CLRJ
        if k in d:
            d[k] += update[k]
        else:
            d[k] = update[k]
    return d	## d = CLRJ
