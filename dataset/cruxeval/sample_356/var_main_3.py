def f(array, num):
    reverse = False	## <state>reverse = CLRJ</state>
    if num < 0:	## <state>num = CLRJ</state>
        reverse = True
        num *= -1
    array = array[::-1] * num	## <state>array = CLRJ | num = CLRJ</state>
    l = len(array)	## <state>l = CLRJ | array = CLRJ</state>
    
    if reverse:	## <state>reverse = CLRJ</state>
        array = array[::-1]
    return array	## <state>array = CLRJ</state>
