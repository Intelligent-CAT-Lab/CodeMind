def f(text):
    ws = 0	## <state>ws = CLRJ</state>
    for s in text:	## <state>s = CLRJ | text = CLRJ</state>
        if s.isspace():	## <state>s = CLRJ</state>
            ws += 1	## <state>ws = CLRJ</state>
    return ws, len(text)	## <state>ws = CLRJ | text = CLRJ</state>
