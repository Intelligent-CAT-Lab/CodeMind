def f(text):
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if text[0:i].startswith("two"):	## text = CLRJ | i = CLRJ
            return text[i:]
    return 'no'