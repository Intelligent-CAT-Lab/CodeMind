def f(array, index, value):
    array.insert(0, index + 1)	## array = CLRJ | index = CLRJ
    if value >= 1:	## value = CLRJ
        array.insert(index, value)	## array = CLRJ | index = CLRJ | value = CLRJ
    return array	## array = CLRJ
