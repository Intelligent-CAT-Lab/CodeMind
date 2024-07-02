def f(array, elem):
    elem = str(elem)
    d = 0
    for i in array:
        if str(i) == elem:
            d += 1
    return d
f([-1, 2, 1, -8, -8, 2], 2)