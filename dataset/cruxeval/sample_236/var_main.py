def f(array):
    if len(array) == 1:	## {"array" : ''}
        return ''.join(array)
    result = list(array)	## {"result" : '',"array" : ''}
    i = 0	## {"i" : ''}
    while i < len(array)-1:	## {"i" : '',"array" : ''}
        for j in range(2):	## {"j" : ''}
            result[i*2] = array[i]	## {"result" : '',"i" : '',"array" : ''}
            i += 1	## {"i" : ''}
    return ''.join(result)	## {"result" : ''}
