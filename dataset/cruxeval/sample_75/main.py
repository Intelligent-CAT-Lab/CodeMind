def f(array, elem):
    ind = array.index(elem)
    return ind * 2 + array[-ind - 1] * 3