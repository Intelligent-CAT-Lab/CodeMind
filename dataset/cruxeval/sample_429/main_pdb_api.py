def f(d):
    result = []
    while len(d.keys()) > 0:
        result.append(d.popitem())
    return result
f({5: 1, 'abc': 2, 'defghi': 2, 87.29: 3})