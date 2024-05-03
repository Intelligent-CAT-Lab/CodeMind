def f(text):
    result = ""	## <state>result = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if i % 2 == 0:	## <state>i = CLRJ</state>
            result += text[i].swapcase()	## <state>result = CLRJ | text = CLRJ | i = CLRJ</state>
        else:
            result += text[i]	## <state>result = CLRJ | text = CLRJ | i = CLRJ</state>
    return result	## <state>result = CLRJ</state>
