def f(text):
    text = list(text)	## <state>text = CLRJ</state>
    for i in range(len(text)-1, -1, -1):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i].isspace():	## <state>text = CLRJ | i = CLRJ</state>
            text[i] = '&nbsp;'	## <state>text = CLRJ | i = CLRJ</state>
    return ''.join(text)	## <state>text = CLRJ</state>
