def f(text, length, index):
    ls = text.rsplit(None, index)	## ls = [] | text = [] | index = []
    return '_'.join([l[:length] for l in ls])	## l = [] | length = [] | ls = []
