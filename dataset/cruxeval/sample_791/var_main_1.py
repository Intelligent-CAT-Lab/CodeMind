def f(integer, n):
    i = 1	## i = CLRJ
    text = str(integer)	## text = CLRJ | integer = CLRJ
    while (i+len(text) < n):	## i = CLRJ | text = CLRJ | n = CLRJ
        i += len(text)
    return text.zfill(i+len(text))	## text = CLRJ | i = CLRJ
