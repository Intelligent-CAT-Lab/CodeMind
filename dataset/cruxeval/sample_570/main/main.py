def f(array, index, value):
    array.insert(0, index + 1)
    if value >= 1:
        array.insert(index, value)
    return array