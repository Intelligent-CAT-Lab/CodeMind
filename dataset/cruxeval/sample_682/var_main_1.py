def f(text, length, index):
    ls = text.rsplit(None, index)	## ls = CLRJ | text = CLRJ | index = CLRJ
    return '_'.join([l[:length] for l in ls])	## l = CLRJ | length = CLRJ | ls = CLRJ
