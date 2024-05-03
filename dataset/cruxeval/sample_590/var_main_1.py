def f(text):
    for i in range(10, 0, -1):	## i = CLRJ
        text = text.lstrip(str(i))	## text = CLRJ | i = CLRJ
    return text	## text = CLRJ
