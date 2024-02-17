def f(array, ind, elem):
    array.insert(-5 if ind < 0 else len(array) if ind > len(array) else ind + 1, elem)
    return array