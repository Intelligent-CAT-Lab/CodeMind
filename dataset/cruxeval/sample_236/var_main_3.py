def f(array):
    if len(array) == 1:	## <state>array = CLRJ</state>
        return ''.join(array)
    result = list(array)	## <state>result = CLRJ | array = CLRJ</state>
    i = 0	## <state>i = CLRJ</state>
    while i < len(array)-1:	## <state>i = CLRJ | array = CLRJ</state>
        for j in range(2):	## <state>j = CLRJ</state>
            result[i*2] = array[i]	## <state>result = CLRJ | i = CLRJ | array = CLRJ</state>
            i += 1	## <state>i = CLRJ</state>
    return ''.join(result)	## <state>result = CLRJ</state>
