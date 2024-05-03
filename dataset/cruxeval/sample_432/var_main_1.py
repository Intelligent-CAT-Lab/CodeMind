def f(length, text):
    if len(text) == length:	## text = CLRJ | length = CLRJ
        return text[::-1]
    return False