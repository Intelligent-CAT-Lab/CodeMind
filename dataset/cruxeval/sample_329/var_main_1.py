def f(text):
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if text[i] == text[i].upper() and text[i-1].islower():	## text = CLRJ | i = CLRJ
            return True
    return False