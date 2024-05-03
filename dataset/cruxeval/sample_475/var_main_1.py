def f(array, index):
    if index < 0:	## index = CLRJ
        index = len(array) + index
    return array[index]	## array = CLRJ | index = CLRJ
