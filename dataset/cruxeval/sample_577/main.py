def f(items):
    result = []
    for number in items:
        d = dict(items).copy()
        d.popitem()
        result.append(d)
        items = d
    return result