def f(text):
    ws = 0	## ws = CLRJ
    for s in text:	## s = CLRJ | text = CLRJ
        if s.isspace():	## s = CLRJ
            ws += 1	## ws = CLRJ
    return ws, len(text)	## ws = CLRJ | text = CLRJ
