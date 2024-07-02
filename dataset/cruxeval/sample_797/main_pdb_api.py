def f(dct):
    lst = []
    for key in sorted(dct):
        lst.append((key, dct[key]))
    return lst
f({'a': 1, 'b': 2, 'c': 3})