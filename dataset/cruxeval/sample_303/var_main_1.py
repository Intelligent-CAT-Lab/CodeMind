def f(text):
    i = (len(text) + 1) // 2	## i = CLRJ | text = CLRJ
    result = list(text)	## result = CLRJ | text = CLRJ
    while i < len(text):	## i = CLRJ | text = CLRJ
        t = result[i].lower()	## t = CLRJ | result = CLRJ | i = CLRJ
        if t == result[i]:	## t = CLRJ | result = CLRJ | i = CLRJ
            i += 1	## i = CLRJ
        else:
            result[i] = t	## result = CLRJ | i = CLRJ | t = CLRJ
        i += 2	## i = CLRJ
    return ''.join(result)	## result = CLRJ
