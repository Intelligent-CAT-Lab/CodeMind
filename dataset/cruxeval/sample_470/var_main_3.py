def f(number):
    transl = {'A': 1, 'B': 2, 'C': 3, 'D': 4, 'E': 5}	## <state>transl = CLRJ</state>
    result = []	## <state>result = CLRJ</state>
    for key, value in transl.items():	## <state>key = CLRJ | value = CLRJ | transl = CLRJ</state>
        if value % number == 0:	## <state>value = CLRJ | number = CLRJ</state>
            result.append(key)	## <state>result = CLRJ | key = CLRJ</state>
    return result	## <state>result = CLRJ</state>
