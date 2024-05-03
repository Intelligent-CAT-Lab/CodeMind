def f(arr):
    result = []	## <state>result = CLRJ</state>
    for item in arr:	## <state>item = CLRJ | arr = CLRJ</state>
        try:
            if item.isnumeric():	## <state>item = CLRJ</state>
                result.append(int(item)*2)	## <state>result = CLRJ | item = CLRJ</state>
        except ValueError:
            result.append(item[::-1])
    return result	## <state>result = CLRJ</state>
