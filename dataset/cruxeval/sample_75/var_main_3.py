def f(array, elem):
    ind = array.index(elem)	## <state>ind = CLRJ | array = CLRJ | elem = CLRJ</state>
    return ind * 2 + array[-ind - 1] * 3	## <state>ind = CLRJ | array = CLRJ</state>
