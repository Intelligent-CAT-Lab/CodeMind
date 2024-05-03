def f(array, elem):
    if elem in array:	## elem = [] | array = []
        return array.index(elem)	## array = [] | elem = []
    return -1