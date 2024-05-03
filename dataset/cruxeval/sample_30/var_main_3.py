def f(array):
    result = []	## <state>result = CLRJ</state>
    for elem in array:	## <state>elem = CLRJ | array = CLRJ</state>
        if elem.isascii() or (isinstance(elem, int) and not str(abs(elem)).isascii()):	## <state>elem = CLRJ</state>
            result.append(elem)	## <state>result = CLRJ | elem = CLRJ</state>
    return result	## <state>result = CLRJ</state>
