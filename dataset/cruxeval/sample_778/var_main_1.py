def f(prefix, text):
    if text.startswith(prefix):	## text = CLRJ | prefix = CLRJ
        return text
    else:
        return prefix + text	## prefix = CLRJ | text = CLRJ
