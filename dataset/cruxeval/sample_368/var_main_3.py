def f(string, numbers):
    arr = []	## <state>arr = CLRJ</state>
    for num in numbers:	## <state>num = CLRJ | numbers = CLRJ</state>
        arr.append(string.zfill(num))	## <state>arr = CLRJ | string = CLRJ | num = CLRJ</state>
    return ' '.join(arr)	## <state>arr = CLRJ</state>
