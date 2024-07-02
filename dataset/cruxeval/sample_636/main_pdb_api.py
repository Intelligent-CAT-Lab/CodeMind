def f(d):
    r = {}
    while len(d) > 0:
        r = {**r, **d}
        del d[max(d.keys())]
    return r
f({ 3: 'A3', 1: 'A1', 2: 'A2' })