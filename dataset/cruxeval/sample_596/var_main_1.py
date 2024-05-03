def f(txt, alpha):
    txt = sorted(txt)	## txt = CLRJ
    if txt.index(alpha) % 2 == 0:	## txt = CLRJ | alpha = CLRJ
        return txt[::-1]
    return txt	## txt = CLRJ
