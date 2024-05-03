def f(text, old, new):
    text2 = text.replace(old, new)	## text2 = CLRJ | text = CLRJ | old = CLRJ | new = CLRJ
    old2 = old[::-1]	## old2 = CLRJ | old = CLRJ
    while old2 in text2:	## old2 = CLRJ | text2 = CLRJ
        text2 = text2.replace(old2, new)
    return text2	## text2 = CLRJ
