def f(d, n):
    for i in range(n):
        item = d.popitem()
        d[item[1]] = item[0]
    return d