def f(text):
    result = ''	## <state>result = CLRJ</state>
    mid = (len(text) - 1) // 2	## <state>mid = CLRJ | text = CLRJ</state>
    for i in range(mid):	## <state>i = CLRJ | mid = CLRJ</state>
        result += text[i]	## <state>result = CLRJ | text = CLRJ | i = CLRJ</state>
    for i in range(mid, len(text)-1):	## <state>i = CLRJ | mid = CLRJ | text = CLRJ</state>
        result += text[mid + len(text) - 1 - i]	## <state>result = CLRJ | text = CLRJ | mid = CLRJ | i = CLRJ</state>
    return result.ljust(len(text), text[-1])	## <state>result = CLRJ | text = CLRJ</state>
