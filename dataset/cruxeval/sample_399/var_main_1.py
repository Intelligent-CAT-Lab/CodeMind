def f(text, old, new):
    if len(old) > 3:	## old = CLRJ
        return text
    if old in text and ' ' not in text:	## old = CLRJ | text = CLRJ
        return text.replace(old, new*len(old))	## text = CLRJ | old = CLRJ | new = CLRJ
    while old in text:
        text = text.replace(old, new)
    return text