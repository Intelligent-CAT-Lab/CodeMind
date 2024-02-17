def f(a, b):
    d = dict(zip(a, b))
    a.sort(key=d.get, reverse=True)
    return [d.pop(x) for x in a]