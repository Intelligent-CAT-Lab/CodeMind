def f(a, b):
    d = dict(zip(a, b))
    a.sort(key=d.get, reverse=True)
    return [d.pop(x) for x in a]
f(['12','ab'], [2,2])