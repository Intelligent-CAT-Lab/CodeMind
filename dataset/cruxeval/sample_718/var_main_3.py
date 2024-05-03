def f(text):
    t = text	## <state>t = CLRJ | text = CLRJ</state>
    for i in text:	## <state>i = CLRJ | text = CLRJ</state>
        text = text.replace(i, '')	## <state>text = CLRJ | i = CLRJ</state>
    return str(len(text)) + t	## <state>text = CLRJ | t = CLRJ</state>
