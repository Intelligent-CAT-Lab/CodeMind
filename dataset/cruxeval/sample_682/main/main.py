def f(text, length, index):
    ls = text.rsplit(None, index)
    return '_'.join([l[:length] for l in ls])