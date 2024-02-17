def f(a):
    b = a.copy()
    for k in range(0, len(a) - 1, 2):
        b.insert(k + 1, b[k])
    b.append(b[0])
    return b