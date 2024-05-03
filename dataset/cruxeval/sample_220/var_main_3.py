def f(text, m, n):
    text = "{}{}{}".format(text, text[:m], text[n:])	## <state>text = CLRJ | m = CLRJ | n = CLRJ</state>
    result = ""	## <state>result = CLRJ</state>
    for i in range(n, len(text)-m):	## <state>i = CLRJ | n = CLRJ | text = CLRJ | m = CLRJ</state>
        result = text[i] + result	## <state>result = CLRJ | text = CLRJ | i = CLRJ</state>
    return result	## <state>result = CLRJ</state>
