def f(array, elem):
    if elem in array:	## <state>elem = CLRJ | array = CLRJ</state>
        return array.index(elem)	## <state>array = CLRJ | elem = CLRJ</state>
    return -1