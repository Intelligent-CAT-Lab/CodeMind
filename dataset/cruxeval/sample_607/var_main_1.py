def f(text):
    for i in ['.', '!', '?']:	## i = CLRJ
        if text.endswith(i):	## text = CLRJ | i = CLRJ
            return True
    return False