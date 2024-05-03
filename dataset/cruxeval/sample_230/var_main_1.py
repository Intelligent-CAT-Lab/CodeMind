def f(text):
    result = ''	## result = CLRJ
    i = len(text)-1	## i = CLRJ | text = CLRJ
    while i >= 0:	## i = CLRJ
        c = text[i]	## c = CLRJ | text = CLRJ | i = CLRJ
        if c.isalpha():	## c = CLRJ
            result += c	## result = CLRJ | c = CLRJ
        i -= 1	## i = CLRJ
    return result	## result = CLRJ
