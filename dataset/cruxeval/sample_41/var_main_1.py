def f(array, values):
    array.reverse()	## array = CLRJ
    for value in values:	## value = CLRJ | values = CLRJ
        array.insert(len(array) // 2, value)	## array = CLRJ | value = CLRJ
    array.reverse()	## array = CLRJ
    return array	## array = CLRJ
