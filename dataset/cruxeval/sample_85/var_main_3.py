def f(n):
    values = {0: 3, 1: 4.5, 2: '-'}	## <state>values = CLRJ</state>
    res = {}	## <state>res = CLRJ</state>
    for i, j in values.items():	## <state>i = CLRJ | j = CLRJ | values = CLRJ</state>
        if i % n != 2:	## <state>i = CLRJ | n = CLRJ</state>
            res[j] = n // 2	## <state>res = CLRJ | j = CLRJ | n = CLRJ</state>
    return sorted(res)	## <state>res = CLRJ</state>
