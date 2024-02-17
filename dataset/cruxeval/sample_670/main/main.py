def f(a, b):
    d = dict(list(zip(a, b)))
    a.sort(key=d.get, reverse=True)
    return [d.pop(x) for x in a]