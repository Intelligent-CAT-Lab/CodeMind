def f(d):
    result = []
    while len(list(d.keys())) > 0:
        result.append(d.popitem())
    return result