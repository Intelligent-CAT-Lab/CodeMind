def f(array, x, i):
    if i < -len(array) or i > len(array) - 1:
        return 'no'
    temp = array[i]
    array[i] = x
    return array