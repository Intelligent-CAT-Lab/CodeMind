def f(array, elem):
    elem = str(elem)	## <state>elem = CLRJ</state>
    d = 0	## <state>d = CLRJ</state>
    for i in array:	## <state>i = CLRJ | array = CLRJ</state>
        if str(i) == elem:	## <state>i = CLRJ | elem = CLRJ</state>
            d += 1	## <state>d = CLRJ</state>
    return d	## <state>d = CLRJ</state>
