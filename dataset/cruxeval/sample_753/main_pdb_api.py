def f(bag):
    values = list(bag.values())
    tbl = {}
    for v in range(100):
        if v in values:
            tbl[v] = values.count(v)
    return tbl
f({0: 0, 1: 0, 2: 0, 3: 0, 4: 0})