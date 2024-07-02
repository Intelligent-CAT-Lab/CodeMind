def f(array, elem):
    array.extend(elem)
    return array
f([[1, 2, 3], [1, 2], 1], [[1, 2, 3], 3, [2, 1]])