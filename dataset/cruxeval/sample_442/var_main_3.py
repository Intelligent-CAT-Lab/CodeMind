def f(lst):
    res = []	## <state>res = CLRJ</state>
    for i in range(len(lst)):	## <state>i = CLRJ | lst = CLRJ</state>
        if lst[i] % 2 == 0:	## <state>lst = CLRJ | i = CLRJ</state>
            res.append(lst[i])	## <state>res = CLRJ | lst = CLRJ | i = CLRJ</state>

    return lst.copy()	## <state>lst = CLRJ</state>
