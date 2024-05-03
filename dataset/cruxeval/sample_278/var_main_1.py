def f(array1, array2):
    result = dict.fromkeys(array1)	## result = CLRJ | array1 = CLRJ
    for key in result:	## key = CLRJ | result = CLRJ
        result[key] = [el for el in array2 if key * 2 > el]	## result = CLRJ | key = CLRJ | el = CLRJ | array2 = CLRJ
    return result	## result = CLRJ
