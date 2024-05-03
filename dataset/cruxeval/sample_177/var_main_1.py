def f(text):
    text = list(text)	## text = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if i % 2 == 1:	## i = CLRJ
            text[i] = text[i].swapcase()	## text = CLRJ | i = CLRJ
    return ''.join(text)	## text = CLRJ
