def f(d):
    d = d.copy()
    d.popitem()
    return d
f({"l": 1, "t": 2, "x:": 3})