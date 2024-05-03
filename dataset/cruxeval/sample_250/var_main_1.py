def f(text):
    count = len(text)	## count = CLRJ | text = CLRJ
    for i in range(-count+1, 0):	## i = CLRJ | count = CLRJ
        text = text + text[i]	## text = CLRJ | i = CLRJ
    return text	## text = CLRJ
