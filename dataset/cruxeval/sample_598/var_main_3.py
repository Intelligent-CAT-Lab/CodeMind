def f(text, n):
    length = len(text)	## <state>length = CLRJ | text = CLRJ</state>
    return text[length*(n%4):length ]	## <state>text = CLRJ | length = CLRJ | n = CLRJ</state>
