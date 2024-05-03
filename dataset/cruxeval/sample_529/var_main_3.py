def f(array):
    prev = array[0]	## <state>prev = CLRJ | array = CLRJ</state>
    newArray = array[:]	## <state>newArray = CLRJ | array = CLRJ</state>
    for i in range(1, len(array)):	## <state>i = CLRJ | array = CLRJ</state>
        if prev != array[i]:	## <state>prev = CLRJ | array = CLRJ | i = CLRJ</state>
            newArray[i] = array[i]	## <state>newArray = CLRJ | i = CLRJ | array = CLRJ</state>
        else:
            del newArray[i]
        prev = array[i]	## <state>prev = CLRJ | array = CLRJ | i = CLRJ</state>
    return newArray	## <state>newArray = CLRJ</state>
