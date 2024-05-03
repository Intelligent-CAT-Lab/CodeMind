def f(array):
    return_arr = []	## <state>return_arr = CLRJ</state>
    for a in array:	## <state>a = CLRJ | array = CLRJ</state>
        return_arr.append(a.copy())	## <state>return_arr = CLRJ | a = CLRJ</state>
    return return_arr	## <state>return_arr = CLRJ</state>
