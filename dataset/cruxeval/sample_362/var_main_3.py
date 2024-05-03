def f(text):
    for i in range(len(text)-1):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i:].islower():	## <state>text = CLRJ | i = CLRJ</state>
            return text[i + 1:]	## <state>text = CLRJ | i = CLRJ</state>
    return ''