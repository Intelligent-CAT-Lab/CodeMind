def f(text, prefix):
    if text.startswith(prefix):	## text = CLRJ | prefix = CLRJ
        text = text.removeprefix(prefix)
    text = text.capitalize()	## text = CLRJ
    return text	## text = CLRJ
