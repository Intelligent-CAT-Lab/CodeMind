def f(text, value):
    if not value in text:	## value = CLRJ | text = CLRJ
        return ''
    return text.rpartition(value)[0]	## text = CLRJ | value = CLRJ
