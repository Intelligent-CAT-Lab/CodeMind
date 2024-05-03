def f(array):
    while -1 in array:	## <state>array = CLRJ</state>
        array.pop(-3)
    while 0 in array:	## <state>array = CLRJ</state>
        array.pop()	## <state>array = CLRJ</state>
    while 1 in array:	## <state>array = CLRJ</state>
        array.pop(0)
    return array	## <state>array = CLRJ</state>
