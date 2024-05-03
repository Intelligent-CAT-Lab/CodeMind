def f(array, list):
    array.extend(list)	## <state>array = CLRJ | list = CLRJ</state>
    [e for e in array if e % 2 == 0]	## <state>e = CLRJ | array = CLRJ</state>
    return [e for e in array if e >= 10]	## <state>e = CLRJ | array = CLRJ</state>
