def f(array):
    prev = array[0]	## prev = CLRJ | array = CLRJ
    newArray = array[:]	## newArray = CLRJ | array = CLRJ
    for i in range(1, len(array)):	## i = CLRJ | array = CLRJ
        if prev != array[i]:	## prev = CLRJ | array = CLRJ | i = CLRJ
            newArray[i] = array[i]	## newArray = CLRJ | i = CLRJ | array = CLRJ
        else:
            del newArray[i]
        prev = array[i]	## prev = CLRJ | array = CLRJ | i = CLRJ
    return newArray	## newArray = CLRJ
