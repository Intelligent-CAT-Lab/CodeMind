def f(text):
    result = ''	## <state>result = CLRJ</state>
    for i in range(len(text)-1, -1, -1):	## <state>i = CLRJ | text = CLRJ</state>
        result += text[i]	## <state>result = CLRJ | text = CLRJ | i = CLRJ</state>
    return result	## <state>result = CLRJ</state>
