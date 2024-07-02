def f(d):
    i = len(d) - 1
    key = list(d.keys())[i]
    d.pop(key, None)
    return key, d
f(dict(e=1, d=2, c=3))