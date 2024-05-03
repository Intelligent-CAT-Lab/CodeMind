def f(array):
    array_2 = []	## <state>array_2 = CLRJ</state>
    for i in array:	## <state>i = CLRJ | array = CLRJ</state>
        if i>0:	## <state>i = CLRJ</state>
            array_2 += [i]	## <state>array_2 = CLRJ | i = CLRJ</state>
    array_2.sort(reverse=True)	## <state>array_2 = CLRJ</state>
    return array_2	## <state>array_2 = CLRJ</state>
