def f(array):
    if len(array) == 1:	## array = CLRJ
        return ''.join(array)
    result = list(array)	## result = CLRJ | array = CLRJ
    i = 0	## i = CLRJ
    while i < len(array)-1:	## i = CLRJ | array = CLRJ
        for j in range(2):	## j = CLRJ
            result[i*2] = array[i]	## result = CLRJ | i = CLRJ | array = CLRJ
            i += 1	## i = CLRJ
    return ''.join(result)	## result = CLRJ
