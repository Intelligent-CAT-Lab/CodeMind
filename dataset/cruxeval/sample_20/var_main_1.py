def f(text):
    result = ''	## result = CLRJ
    for i in range(len(text)-1, -1, -1):	## i = CLRJ | text = CLRJ
        result += text[i]	## result = CLRJ | text = CLRJ | i = CLRJ
    return result	## result = CLRJ
