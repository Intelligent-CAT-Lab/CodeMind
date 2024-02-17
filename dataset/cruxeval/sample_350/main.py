def f(d):
    size = len(d)
    v = [0] * size
    if size == 0:
        return v
    for i, e in enumerate(d.values()):
        v[i] = e
    return v