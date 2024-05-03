def f(array):
    c = array	## <state>c = CLRJ | array = CLRJ</state>
    array_copy = array	## <state>array_copy = CLRJ | array = CLRJ</state>

    while True:
        c.append('_')	## <state>c = CLRJ</state>
        if c == array_copy:	## <state>c = CLRJ | array_copy = CLRJ</state>
            array_copy[c.index('_')] = ''	## <state>array_copy = CLRJ | c = CLRJ</state>
            break
        
    return array_copy	## <state>array_copy = CLRJ</state>
