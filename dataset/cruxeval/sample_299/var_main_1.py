def f(text, char):
    if not text.endswith(char):	## text = CLRJ | char = CLRJ
        return f(char + text, char)
    return text	## text = CLRJ
