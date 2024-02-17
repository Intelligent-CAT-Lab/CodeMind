def f(text, old, new):
    text2 = text.replace(old, new)
    old2 = old[::-1]
    while old2 in text2:
        text2 = text2.replace(old2, new)
    return text2