def f(array):
    array.reverse()
    array.clear()
    array.extend('x'*len(array))
    array.reverse()
    return array
f([3, -2, 0])