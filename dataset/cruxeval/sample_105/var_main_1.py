def f(text):
    if not text.istitle():	## text = CLRJ
        return text.title()	## text = CLRJ
    return text.lower()