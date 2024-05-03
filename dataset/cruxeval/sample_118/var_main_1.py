def f(text, chars):
    num_applies = 2	## num_applies = CLRJ
    extra_chars = ''	## extra_chars = CLRJ
    for i in range(num_applies):	## i = CLRJ | num_applies = CLRJ
        extra_chars += chars	## extra_chars = CLRJ | chars = CLRJ
        text = text.replace(extra_chars, '')	## text = CLRJ | extra_chars = CLRJ
    return text	## text = CLRJ
