def f(array):
    array.reverse()	## <state>array = CLRJ</state>
    array.clear()	## <state>array = CLRJ</state>
    array.extend('x'*len(array))	## <state>array = CLRJ</state>
    array.reverse()	## <state>array = CLRJ</state>
    return array	## <state>array = CLRJ</state>
