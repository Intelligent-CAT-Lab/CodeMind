def f(d):
    r = {}
    while len(d) > 0:
        r = {**r, **d}
        del d[max(d.keys())]
    return r