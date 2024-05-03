def f(text):
    for c in text:	## <state>c = CLRJ | text = CLRJ</state>
        if not c.isnumeric():	## <state>c = CLRJ</state>
            return False
    return bool(text)	## <state>text = CLRJ</state>
