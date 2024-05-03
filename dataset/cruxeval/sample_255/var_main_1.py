def f(text, fill, size):
    if size < 0:	## size = CLRJ
        size = -size
    if len(text) > size:	## text = CLRJ | size = CLRJ
        return text[len(text) - size:]	## text = CLRJ | size = CLRJ
    return text.rjust(size, fill)