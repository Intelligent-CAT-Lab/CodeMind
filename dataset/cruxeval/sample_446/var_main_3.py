def f(array):
    l = len(array)	## <state>l = CLRJ | array = CLRJ</state>
    if l % 2 == 0:	## <state>l = CLRJ</state>
        array.clear()	## <state>array = CLRJ</state>
    else:
        array.reverse()
    return array	## <state>array = CLRJ</state>
