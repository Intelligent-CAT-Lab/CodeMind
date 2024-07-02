def f(d, n):
    for i in range(n):
        item = d.popitem()
        d[item[1]] = item[0]
    return d
f({1: 2, 3: 4, 5: 6, 7: 8, 9: 10}, 1)