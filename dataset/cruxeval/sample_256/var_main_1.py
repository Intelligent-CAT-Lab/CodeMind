def f(text, sub):
    a = 0	## a = CLRJ
    b = len(text) - 1	## b = CLRJ | text = CLRJ

    while a <= b:	## a = CLRJ | b = CLRJ
        c = (a + b) // 2	## c = CLRJ | a = CLRJ | b = CLRJ
        if text.rfind(sub) >= c:	## text = CLRJ | sub = CLRJ | c = CLRJ
            a = c + 1
        else:
            b = c - 1	## b = CLRJ | c = CLRJ

    return a	## a = CLRJ
