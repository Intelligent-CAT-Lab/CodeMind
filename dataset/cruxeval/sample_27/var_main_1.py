def f(w):
    ls = list(w)	## ls = CLRJ | w = CLRJ
    omw = ''	## omw = CLRJ
    while len(ls) > 0:	## ls = CLRJ
        omw += ls.pop(0)	## omw = CLRJ | ls = CLRJ
        if len(ls) * 2 > len(w):	## ls = CLRJ | w = CLRJ
            return w[len(ls):] == omw	## w = CLRJ | ls = CLRJ | omw = CLRJ
    return False