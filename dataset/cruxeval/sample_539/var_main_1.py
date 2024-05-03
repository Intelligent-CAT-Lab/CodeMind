def f(array):
    c = array	## c = CLRJ | array = CLRJ
    array_copy = array	## array_copy = CLRJ | array = CLRJ

    while True:
        c.append('_')	## c = CLRJ
        if c == array_copy:	## c = CLRJ | array_copy = CLRJ
            array_copy[c.index('_')] = ''	## array_copy = CLRJ | c = CLRJ
            break
        
    return array_copy	## array_copy = CLRJ
