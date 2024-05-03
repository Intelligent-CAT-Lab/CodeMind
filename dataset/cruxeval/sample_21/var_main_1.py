def f(array):
    n = array.pop()	## n = CLRJ | array = CLRJ
    array.extend([n, n])	## array = CLRJ | n = CLRJ
    return array	## array = CLRJ
