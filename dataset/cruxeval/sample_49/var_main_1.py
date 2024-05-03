def f(text):
    if text.isidentifier():	## text = CLRJ
        return ''.join(c for c in text if c.isdigit())
    else:
        return ''.join(text)	## text = CLRJ
