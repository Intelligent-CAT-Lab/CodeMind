def f(bag):
    values = list(bag.values())
    tbl = {}
    for v in range(100):
        if v in values:
            tbl[v] = values.count(v)
    return tbl