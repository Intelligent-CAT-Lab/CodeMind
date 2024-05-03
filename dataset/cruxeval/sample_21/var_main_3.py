def f(array):
    n = array.pop()	## <state>n = CLRJ | array = CLRJ</state>
    array.extend([n, n])	## <state>array = CLRJ | n = CLRJ</state>
    return array	## <state>array = CLRJ</state>
