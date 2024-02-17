def f(d):
    result = []
    while len(d.keys()) > 0:
        result.append(d.popitem())
    return result