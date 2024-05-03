def f(text):
    for i in range(len(text)-1, 0, -1):	## i = CLRJ | text = CLRJ
        if not text[i].isupper():	## text = CLRJ | i = CLRJ
            return text[0:i]	## text = CLRJ | i = CLRJ
    return ''