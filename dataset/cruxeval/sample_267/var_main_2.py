def f(text, space):
    if space < 0:	## space = []
        return text	## text = []
    return text.ljust(len(text) // 2 + space)