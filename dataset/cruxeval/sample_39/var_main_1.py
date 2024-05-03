def f(array, elem):
    if elem in array:	## elem = CLRJ | array = CLRJ
        return array.index(elem)	## array = CLRJ | elem = CLRJ
    return -1