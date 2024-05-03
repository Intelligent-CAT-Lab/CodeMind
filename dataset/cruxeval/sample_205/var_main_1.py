def f(a):
    for _ in range(10):	## _ = CLRJ
        for j in range(len(a)):	## j = CLRJ | a = CLRJ
            if a[j] != '#':	## a = CLRJ | j = CLRJ
                a = a[j:]	## a = CLRJ | j = CLRJ
                break
        else:
            a = ""
            break
    while a[-1] == '#':	## a = CLRJ
        a = a[:-1]	## a = CLRJ
    return a	## a = CLRJ
