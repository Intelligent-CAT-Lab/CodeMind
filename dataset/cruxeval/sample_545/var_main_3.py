def f(array):
    result = []	## <state>result = CLRJ</state>
    index = 0	## <state>index = CLRJ</state>
    while index < len(array):	## <state>index = CLRJ | array = CLRJ</state>
        result.append(array.pop())	## <state>result = CLRJ | array = CLRJ</state>
        index += 2	## <state>index = CLRJ</state>
    return result	## <state>result = CLRJ</state>
