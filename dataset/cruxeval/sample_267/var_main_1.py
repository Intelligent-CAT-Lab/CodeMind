def f(text, space):
    if space < 0:	## space = CLRJ
        return text	## text = CLRJ
    return text.ljust(len(text) // 2 + space)