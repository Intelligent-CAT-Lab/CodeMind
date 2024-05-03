def f(array, x, i):
    if i < -len(array) or i > len(array) - 1:	## i = CLRJ | array = CLRJ
        return 'no'
    temp = array[i]	## temp = CLRJ | array = CLRJ | i = CLRJ
    array[i] = x	## array = CLRJ | i = CLRJ | x = CLRJ
    return array	## array = CLRJ
