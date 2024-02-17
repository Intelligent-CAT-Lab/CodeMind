def f(d):
    i = len(d) - 1
    key = list(d.keys())[i]
    d.pop(key, None)
    return key, d