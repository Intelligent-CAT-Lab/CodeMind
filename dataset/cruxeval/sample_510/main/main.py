def f(a, b, c, d, e):
    key = d
    if key in a:
        num = a.pop(key)
    if b > 3:
        return ''.join(c)
    else:
        return num