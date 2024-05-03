def f(text, sub):
    index = []	## index = CLRJ
    starting = 0	## starting = CLRJ
    while starting != -1:	## starting = CLRJ
        starting = text.find(sub, starting)	## starting = CLRJ | text = CLRJ | sub = CLRJ
        if starting != -1:	## starting = CLRJ
            index.append(starting)
            starting += len(sub)
    return index	## index = CLRJ
