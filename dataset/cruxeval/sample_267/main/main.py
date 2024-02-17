def f(text, space):
    if space < 0:
        return text
    return text.ljust(len(text) // 2 + space)