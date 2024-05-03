def f(n, array):
    final = [array.copy()] 	## <state>final = CLRJ | array = CLRJ</state>
    for i in range(n):	## <state>i = CLRJ | n = CLRJ</state>
        arr = array.copy()	## <state>arr = CLRJ | array = CLRJ</state>
        arr.extend(final[-1])	## <state>arr = CLRJ | final = CLRJ</state>
        final.append(arr)	## <state>final = CLRJ | arr = CLRJ</state>
    return final	## <state>final = CLRJ</state>
