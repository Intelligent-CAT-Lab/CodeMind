def f(text, old, new):
    if len(old) > 3:	## old = []
        return text
    if old in text and ' ' not in text:	## old = [] | text = []
        return text.replace(old, new*len(old))	## text = [] | old = [] | new = []
    while old in text:
        text = text.replace(old, new)
    return text