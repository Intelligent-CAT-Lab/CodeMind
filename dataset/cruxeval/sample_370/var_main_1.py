def f(text):
    for char in text:	## char = CLRJ | text = CLRJ
        if not char.isspace():	## char = CLRJ
            return False
    return True