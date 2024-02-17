def f(array, values):
    array.reverse()
    for value in values:
        array.insert(len(array) // 2, value)
    array.reverse()
    return array