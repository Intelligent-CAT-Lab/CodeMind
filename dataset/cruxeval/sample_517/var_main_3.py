def f(text):
    for i in range(len(text)-1, 0, -1):	## <state>i = CLRJ | text = CLRJ</state>
        if not text[i].isupper():	## <state>text = CLRJ | i = CLRJ</state>
            return text[0:i]	## <state>text = CLRJ | i = CLRJ</state>
    return ''