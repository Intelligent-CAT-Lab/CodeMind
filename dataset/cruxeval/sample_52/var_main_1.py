def f(text):
    a = []	## a = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if not text[i].isdecimal():	## text = CLRJ | i = CLRJ
            a.append(text[i])	## a = CLRJ | text = CLRJ | i = CLRJ
    return ''.join(a)	## a = CLRJ
