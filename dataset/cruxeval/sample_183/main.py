def f(text):
    ls = text.split()
    lines = " ".join(ls[::3]).splitlines()
    res = []
    for i in range(2):
        ln = ls[1::3]
        if 3 * i + 1 < len(ln):
            res.append(" ".join(ln[3 * i:3 * (i + 1)]))
    return lines + res