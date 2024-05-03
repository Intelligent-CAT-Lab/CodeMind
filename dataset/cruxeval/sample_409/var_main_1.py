def f(text, char):
    if text:	## text = CLRJ
        text = text.removeprefix(char)	## text = CLRJ | char = CLRJ
        text = text.removeprefix(text[-1])
        text = text[:-1] + text[-1].capitalize()
    return text