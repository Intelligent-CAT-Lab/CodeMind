def f(text, s, e):
    sublist = text[s:e]	## sublist = CLRJ | text = CLRJ | s = CLRJ | e = CLRJ
    if not sublist:	## sublist = CLRJ
        return -1
    return sublist.index(min(sublist))	## sublist = CLRJ
