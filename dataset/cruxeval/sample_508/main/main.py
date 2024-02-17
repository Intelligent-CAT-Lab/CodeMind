def f(text, sep, maxsplit):
    splitted = text.rsplit(sep, maxsplit)
    length = len(splitted)
    new_splitted = splitted[:length // 2]
    new_splitted.reverse()
    new_splitted += splitted[length // 2:]
    return sep.join(new_splitted)