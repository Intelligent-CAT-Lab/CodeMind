def f(text):
    for i in range(len(text)-1):	## i = CLRJ | text = CLRJ
        if text[i:].islower():	## text = CLRJ | i = CLRJ
            return text[i + 1:]	## text = CLRJ | i = CLRJ
    return ''