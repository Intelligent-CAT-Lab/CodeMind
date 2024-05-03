def f(array1, array2):
    result = dict.fromkeys(array1)	## <state>result = CLRJ | array1 = CLRJ</state>
    for key in result:	## <state>key = CLRJ | result = CLRJ</state>
        result[key] = [el for el in array2 if key * 2 > el]	## <state>result = CLRJ | key = CLRJ | el = CLRJ | array2 = CLRJ</state>
    return result	## <state>result = CLRJ</state>
