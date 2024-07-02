def f(d, k):
    new_d = {}
    for key, val in d.items():
        if key < k:
            new_d[key] = val
    return new_d
f({1: 2, 2: 4, 3: 3}, 3)