def f(array, list):
    array.extend(list)
    [e for e in array if e % 2 == 0]
    return [e for e in array if e >= 10]