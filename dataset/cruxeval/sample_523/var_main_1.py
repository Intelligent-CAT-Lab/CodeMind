def f(text):
    text = list(text)	## text = CLRJ
    for i in range(len(text)-1, -1, -1):	## i = CLRJ | text = CLRJ
        if text[i].isspace():	## text = CLRJ | i = CLRJ
            text[i] = '&nbsp;'	## text = CLRJ | i = CLRJ
    return ''.join(text)	## text = CLRJ
