def f(text, old, new):
    if len(old) > 3:
        return text
    if old in text and ' ' not in text:
        return text.replace(old, new*len(old))
    while old in text:
        text = text.replace(old, new)
    return text