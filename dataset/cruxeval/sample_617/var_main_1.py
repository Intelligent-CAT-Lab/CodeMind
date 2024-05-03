def f(text):
    if text.isascii():	## text = CLRJ
        return 'ascii'
    else:
        return 'non ascii'