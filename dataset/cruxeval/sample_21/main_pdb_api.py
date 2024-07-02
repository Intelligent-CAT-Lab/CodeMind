def f(array):
    n = array.pop()
    array.extend([n, n])
    return array
f([1, 1, 2, 2])