def f(r, w):
    a = []	## a = CLRJ
    if r[0] == w[0] and w[-1] == r[-1]:	## r = CLRJ | w = CLRJ
        a.append(r)
        a.append(w)
    else:
        a.append(w)	## a = CLRJ | w = CLRJ
        a.append(r)	## a = CLRJ | r = CLRJ
    return a	## a = CLRJ
