def f(dct):
    lst = []
    for key in sorted(dct):
        lst.append((key, dct[key]))
    return lst