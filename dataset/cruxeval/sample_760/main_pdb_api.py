def f(d):
    l = []
    while len(d) > 0:
        key = d.popitem()[0]
        l.append(key)
    return l;
f(dict(f = 1, h = 2, j = 3, k = 4))