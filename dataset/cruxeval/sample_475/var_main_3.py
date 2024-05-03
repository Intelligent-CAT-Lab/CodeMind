def f(array, index):
    if index < 0:	## <state>index = CLRJ</state>
        index = len(array) + index
    return array[index]	## <state>array = CLRJ | index = CLRJ</state>
