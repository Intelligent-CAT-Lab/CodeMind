def f(integer, n):
    i = 1	## <state>i = CLRJ</state>
    text = str(integer)	## <state>text = CLRJ | integer = CLRJ</state>
    while (i+len(text) < n):	## <state>i = CLRJ | text = CLRJ | n = CLRJ</state>
        i += len(text)
    return text.zfill(i+len(text))	## <state>text = CLRJ | i = CLRJ</state>
