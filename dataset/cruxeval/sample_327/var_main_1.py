def f(lst):
    new = list()	## new = CLRJ
    i = len(lst)-1	## i = CLRJ | lst = CLRJ
    for _ in range(len(lst)):	## _ = CLRJ | lst = CLRJ
        if i%2 == 0:	## i = CLRJ
            new.append(-lst[i])	## new = CLRJ | lst = CLRJ | i = CLRJ
        else:
            new.append(lst[i])	## new = CLRJ | lst = CLRJ | i = CLRJ
        i -= 1	## i = CLRJ
    return new	## new = CLRJ
