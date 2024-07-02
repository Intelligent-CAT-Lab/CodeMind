def f(text, length, index):
    ls = text.rsplit(None, index)
    return '_'.join([l[:length] for l in ls])
f('hypernimovichyp', 2, 2)