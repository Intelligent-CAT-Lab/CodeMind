def f(c, st, ed):
    d = {}
    a, b = 0, 0
    for x, y in c.items():
        d[y] = x
        if y == st:
            a = x
        if y == ed:
            b = x
    w = d[st]
    return (w, b) if a > b else (b, w)