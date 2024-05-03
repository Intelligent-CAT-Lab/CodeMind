def f(text, value):
    length = len(text)	## length = CLRJ | text = CLRJ
    index = 0	## index = CLRJ
    while length > 0:	## length = CLRJ
        value = text[index] + value	## value = CLRJ | text = CLRJ | index = CLRJ
        length -= 1	## length = CLRJ
        index += 1	## index = CLRJ
    return value	## value = CLRJ
