def f(txt, alpha):
    txt = sorted(txt)
    if txt.index(alpha) % 2 == 0:
        return txt[::-1]
    return txt