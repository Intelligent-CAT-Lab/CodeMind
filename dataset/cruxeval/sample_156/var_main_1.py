def f(text, limit, char):
    if limit < len(text):	## limit = CLRJ | text = CLRJ
        return text[0:limit]
    return text.ljust(limit, char)	## text = CLRJ | limit = CLRJ | char = CLRJ
