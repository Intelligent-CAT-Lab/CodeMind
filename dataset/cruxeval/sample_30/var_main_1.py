def f(array):
    result = []	## result = CLRJ
    for elem in array:	## elem = CLRJ | array = CLRJ
        if elem.isascii() or (isinstance(elem, int) and not str(abs(elem)).isascii()):	## elem = CLRJ
            result.append(elem)	## result = CLRJ | elem = CLRJ
    return result	## result = CLRJ
