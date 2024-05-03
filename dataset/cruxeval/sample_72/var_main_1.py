def f(text):
    for c in text:	## c = CLRJ | text = CLRJ
        if not c.isnumeric():	## c = CLRJ
            return False
    return bool(text)	## text = CLRJ
