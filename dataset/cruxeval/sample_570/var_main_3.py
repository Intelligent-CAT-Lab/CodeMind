def f(array, index, value):
    array.insert(0, index + 1)	## <state>array = CLRJ | index = CLRJ</state>
    if value >= 1:	## <state>value = CLRJ</state>
        array.insert(index, value)	## <state>array = CLRJ | index = CLRJ | value = CLRJ</state>
    return array	## <state>array = CLRJ</state>
