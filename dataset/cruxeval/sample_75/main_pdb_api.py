def f(array, elem):
    ind = array.index(elem)
    return ind * 2 + array[-ind - 1] * 3
f([-1, 2, 1, -8, 2], 2)