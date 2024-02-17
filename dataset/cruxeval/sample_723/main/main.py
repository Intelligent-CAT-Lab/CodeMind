def f(text, separator):
    splitted = text.splitlines()
    if separator:
        return [' '.join(s) for s in splitted]
    else:
        return splitted