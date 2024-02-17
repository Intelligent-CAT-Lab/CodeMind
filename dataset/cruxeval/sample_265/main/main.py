def f(d, k):
    new_d = {}
    for key, val in list(d.items()):
        if key < k:
            new_d[key] = val
    return new_d