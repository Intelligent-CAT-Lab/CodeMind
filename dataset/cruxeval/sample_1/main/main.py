def f(a, b, c):
    result = {}
    for d in a, b, c:
        result.update(dict.fromkeys(d))
    return result