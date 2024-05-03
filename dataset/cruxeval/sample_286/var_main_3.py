def f(array, x, i):
    if i < -len(array) or i > len(array) - 1:	## <state>i = CLRJ | array = CLRJ</state>
        return 'no'
    temp = array[i]	## <state>temp = CLRJ | array = CLRJ | i = CLRJ</state>
    array[i] = x	## <state>array = CLRJ | i = CLRJ | x = CLRJ</state>
    return array	## <state>array = CLRJ</state>
