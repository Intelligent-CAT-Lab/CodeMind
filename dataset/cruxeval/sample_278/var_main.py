def f(array1, array2):
    result = dict.fromkeys(array1)	## {"result" : '',"array1" : ''}
    for key in result:	## {"key" : '',"result" : ''}
        result[key] = [el for el in array2 if key * 2 > el]	## {"result" : '',"key" : '',"el" : '',"array2" : ''}
    return result	## {"result" : ''}
