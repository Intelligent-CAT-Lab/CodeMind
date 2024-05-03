def f(text, chars):
    if chars:	## chars = CLRJ
        text = text.rstrip(chars)	## text = CLRJ | chars = CLRJ
    else:
        text = text.rstrip(' ')
    if text == '':	## text = CLRJ
        return '-'
    return text	## text = CLRJ
