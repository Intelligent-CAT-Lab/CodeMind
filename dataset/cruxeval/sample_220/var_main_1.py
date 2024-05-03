def f(text, m, n):
    text = "{}{}{}".format(text, text[:m], text[n:])	## text = CLRJ | m = CLRJ | n = CLRJ
    result = ""	## result = CLRJ
    for i in range(n, len(text)-m):	## i = CLRJ | n = CLRJ | text = CLRJ | m = CLRJ
        result = text[i] + result	## result = CLRJ | text = CLRJ | i = CLRJ
    return result	## result = CLRJ
