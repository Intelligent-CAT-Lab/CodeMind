def f(array, elem):
    array.reverse()	## <state>array = CLRJ</state>
    try:
        found = array.index(elem)	## <state>found = CLRJ | array = CLRJ | elem = CLRJ</state>
    finally:
        array.reverse()	## <state>array = CLRJ</state>
    return found	## <state>found = CLRJ</state>
