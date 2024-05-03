def f(a):
    if len(a) >= 2 and a[0] > 0 and a[1] > 0:	## a = CLRJ
        a.reverse()
        return a
    a.append(0)	## a = CLRJ
    return a	## a = CLRJ
