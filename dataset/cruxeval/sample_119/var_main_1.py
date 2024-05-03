def f(text):
    result = ""	## result = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if i % 2 == 0:	## i = CLRJ
            result += text[i].swapcase()	## result = CLRJ | text = CLRJ | i = CLRJ
        else:
            result += text[i]	## result = CLRJ | text = CLRJ | i = CLRJ
    return result	## result = CLRJ
