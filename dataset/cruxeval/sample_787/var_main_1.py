def f(text):
    if len(text) == 0:	## text = CLRJ
        return ''
    text = text.lower()	## text = CLRJ
    return text[0].upper() + text[1:]	## text = CLRJ
