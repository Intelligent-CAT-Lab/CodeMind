def f(array, elem):
    if elem in array:
        return array.index(elem)
    return -1
f([6, 2, 7, 1], 6)