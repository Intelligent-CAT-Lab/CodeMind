def f(update, starting):
    d = starting.copy()
    for k in update:
        if k in d:
            d[k] += update[k]
        else:
            d[k] = update[k]
    return d