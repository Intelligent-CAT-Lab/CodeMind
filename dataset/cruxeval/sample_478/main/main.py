def f(sb):
    d = {}
    for s in sb:
        d[s] = d.get(s, 0) + 1
    return d