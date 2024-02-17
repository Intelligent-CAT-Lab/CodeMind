def f(keys, value):
    d = dict.fromkeys(keys, value)
    for i, k in enumerate(d.copy(), 1):
        if d[k] == d[i]:
            del d[i]
    return d