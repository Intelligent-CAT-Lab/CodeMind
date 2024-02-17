def f(original, string):
    temp = dict(original)
    for a, b in string.items():
        temp[b] = a
    return temp