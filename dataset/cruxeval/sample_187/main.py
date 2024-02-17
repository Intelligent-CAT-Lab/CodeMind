def f(d, index):
    length = len(d.items())
    idx = index % length
    v = d.popitem()[1]
    for _ in range(idx):
        d.popitem()
    return v