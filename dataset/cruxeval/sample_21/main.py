def f(array):
    n = array.pop()
    array.extend([n, n])
    return array