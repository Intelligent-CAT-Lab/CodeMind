def f(d):
    l = []
    while len(d) > 0:
        key = d.popitem()[0]
        l.append(key)
    return l;