def f(d):
    dCopy = d.copy()
    for key, value in dCopy.items():
        for i in range(len(value)):
            value[i] = value[i].upper()
    return dCopy