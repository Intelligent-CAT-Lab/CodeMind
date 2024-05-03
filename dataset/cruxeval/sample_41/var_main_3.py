def f(array, values):
    array.reverse()	## <state>array = CLRJ</state>
    for value in values:	## <state>value = CLRJ | values = CLRJ</state>
        array.insert(len(array) // 2, value)	## <state>array = CLRJ | value = CLRJ</state>
    array.reverse()	## <state>array = CLRJ</state>
    return array	## <state>array = CLRJ</state>
