def f(x):
    a = 0	## a = CLRJ
    for i in x.split(' '):	## i = CLRJ | x = CLRJ
        a += len(i.zfill(len(i)*2))	## a = CLRJ | i = CLRJ
    return a	## a = CLRJ
