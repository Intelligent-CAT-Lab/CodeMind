def f(array, elem):
    array.extend(elem)	## <state>array = CLRJ | elem = CLRJ</state>
    return array	## <state>array = CLRJ</state>
