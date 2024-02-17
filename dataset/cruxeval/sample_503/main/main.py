def f(d):
    result = [None] * len(d)
    a = b = 0
    while d:
        result[a] = d.popitem(a == b)
        a, b = b, (b+1) % len(result)
    return result