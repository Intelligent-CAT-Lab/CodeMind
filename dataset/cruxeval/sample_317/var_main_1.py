def f(text, a, b):
    text = text.replace(a, b)	## text = CLRJ | a = CLRJ | b = CLRJ
    return text.replace(b, a)	## text = CLRJ | b = CLRJ | a = CLRJ
