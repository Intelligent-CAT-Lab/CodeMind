def f(text):
    result = ''	## <state>result = CLRJ</state>
    i = len(text)-1	## <state>i = CLRJ | text = CLRJ</state>
    while i >= 0:	## <state>i = CLRJ</state>
        c = text[i]	## <state>c = CLRJ | text = CLRJ | i = CLRJ</state>
        if c.isalpha():	## <state>c = CLRJ</state>
            result += c	## <state>result = CLRJ | c = CLRJ</state>
        i -= 1	## <state>i = CLRJ</state>
    return result	## <state>result = CLRJ</state>
