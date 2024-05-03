def f(lst):
    res = []	## res = CLRJ
    for i in range(len(lst)):	## i = CLRJ | lst = CLRJ
        if lst[i] % 2 == 0:	## lst = CLRJ | i = CLRJ
            res.append(lst[i])	## res = CLRJ | lst = CLRJ | i = CLRJ

    return lst.copy()	## lst = CLRJ
