def f(a, b):
    a = b.join(a)	## a = CLRJ | b = CLRJ
    lst = []	## lst = CLRJ
    for i in range(1, len(a)+1, 2):	## i = CLRJ | a = CLRJ
        lst.append(a[i-1:][:i])	## lst = CLRJ | a = CLRJ | i = CLRJ
        lst.append(a[i-1:][i:])	## lst = CLRJ | a = CLRJ | i = CLRJ
    return lst	## lst = CLRJ
