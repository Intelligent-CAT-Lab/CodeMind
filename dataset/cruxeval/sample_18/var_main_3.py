def f(array, elem):
    k = 0	## <state>k = CLRJ</state>
    l = array.copy()	## <state>l = CLRJ | array = CLRJ</state>
    for i in l:	## <state>i = CLRJ | l = CLRJ</state>
        if i > elem:	## <state>i = CLRJ | elem = CLRJ</state>
            array.insert(k, elem)	## <state>array = CLRJ | k = CLRJ | elem = CLRJ</state>
            break
        k += 1
    return array	## <state>array = CLRJ</state>
