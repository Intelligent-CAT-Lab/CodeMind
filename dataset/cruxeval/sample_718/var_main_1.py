def f(text):
    t = text	## t = CLRJ | text = CLRJ
    for i in text:	## i = CLRJ | text = CLRJ
        text = text.replace(i, '')	## text = CLRJ | i = CLRJ
    return str(len(text)) + t	## text = CLRJ | t = CLRJ
