def f(original, string):
    temp = dict(original)
    for a, b in string.items():
        temp[b] = a
    return temp
f({1: -9, 0: -7}, {1: 2, 0: 3})