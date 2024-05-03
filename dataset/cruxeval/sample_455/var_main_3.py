def f(text):
    uppers = 0	## <state>uppers = CLRJ</state>
    for c in text:	## <state>c = CLRJ | text = CLRJ</state>
        if c.isupper():	## <state>c = CLRJ</state>
            uppers += 1	## <state>uppers = CLRJ</state>
    return text.upper() if uppers >= 10 else text	## <state>uppers = CLRJ | text = CLRJ</state>
