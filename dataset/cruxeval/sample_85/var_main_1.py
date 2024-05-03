def f(n):
    values = {0: 3, 1: 4.5, 2: '-'}	## values = CLRJ
    res = {}	## res = CLRJ
    for i, j in values.items():	## i = CLRJ | j = CLRJ | values = CLRJ
        if i % n != 2:	## i = CLRJ | n = CLRJ
            res[j] = n // 2	## res = CLRJ | j = CLRJ | n = CLRJ
    return sorted(res)	## res = CLRJ
