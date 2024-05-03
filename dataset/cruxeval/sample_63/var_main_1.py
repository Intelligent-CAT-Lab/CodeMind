def f(text, prefix):
    while text.startswith(prefix):	## text = CLRJ | prefix = CLRJ
        text = text[len(prefix):] or text	## text = CLRJ | prefix = CLRJ
    return text	## text = CLRJ
