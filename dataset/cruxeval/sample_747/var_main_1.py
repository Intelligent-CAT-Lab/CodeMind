def f(text):
    if text == '42.42':	## text = CLRJ
        return True
    for i in range(3, len(text) - 3):	## i = CLRJ | text = CLRJ
        if text[i] == '.' and text[i - 3:].isdigit() and text[:i].isdigit():	## text = CLRJ | i = CLRJ
            return True
    return False