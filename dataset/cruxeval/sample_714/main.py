def f(array):
    array.reverse()
    array.clear()
    array.extend('x'*len(array))
    array.reverse()
    return array