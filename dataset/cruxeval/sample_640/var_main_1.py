def f(text):
    a = 0	## a = CLRJ
    if text[0] in text[1:]:	## text = CLRJ
        a += 1	## a = CLRJ
    for i in range(0, len(text)-1):	## i = CLRJ | text = CLRJ
        if text[i] in text[i+1:]:	## text = CLRJ | i = CLRJ
            a += 1	## a = CLRJ
    return a	## a = CLRJ
