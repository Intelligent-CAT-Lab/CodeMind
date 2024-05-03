def f(text, sub):
    index = []	## index = []
    starting = 0	## starting = []
    while starting != -1:	## starting = []
        starting = text.find(sub, starting)	## starting = [] | text = [] | sub = []
        if starting != -1:	## starting = []
            index.append(starting)
            starting += len(sub)
    return index	## index = []
