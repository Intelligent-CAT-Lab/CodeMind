def f(text, pre):
    if not text.startswith(pre):	## text = CLRJ | pre = CLRJ
        return text
    return text.removeprefix(pre)	## text = CLRJ | pre = CLRJ
