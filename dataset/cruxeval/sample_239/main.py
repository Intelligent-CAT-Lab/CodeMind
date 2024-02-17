def f(text, froms):
    text = text.lstrip(froms)
    text = text.rstrip(froms)
    return text