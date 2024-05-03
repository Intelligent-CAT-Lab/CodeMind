def f(text):
    if text and text.isupper():	## text = CLRJ
        cs = str.maketrans(string.ascii_uppercase, string.ascii_lowercase)
        return text.translate(cs)
    return text.lower()[:3]	## text = CLRJ
