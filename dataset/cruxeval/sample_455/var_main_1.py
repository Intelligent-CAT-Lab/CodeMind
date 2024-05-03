def f(text):
    uppers = 0	## uppers = CLRJ
    for c in text:	## c = CLRJ | text = CLRJ
        if c.isupper():	## c = CLRJ
            uppers += 1	## uppers = CLRJ
    return text.upper() if uppers >= 10 else text	## uppers = CLRJ | text = CLRJ
