def f(array, elem):
    ind = array.index(elem)	## ind = [] | array = [] | elem = []
    return ind * 2 + array[-ind - 1] * 3	## ind = [] | array = []
