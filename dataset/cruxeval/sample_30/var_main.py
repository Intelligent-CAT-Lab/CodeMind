def f(array):
    result = []	## {"result" : ''}
    for elem in array:	## {"elem" : '',"array" : ''}
        if elem.isascii() or (isinstance(elem, int) and not str(abs(elem)).isascii()):	## {"elem" : ''}
            result.append(elem)	## {"result" : '',"elem" : ''}
    return result	## {"result" : ''}
