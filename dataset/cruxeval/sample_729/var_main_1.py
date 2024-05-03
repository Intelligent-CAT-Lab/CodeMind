def f(s1,s2):
    res = []	## res = CLRJ
    i = s1.rfind(s2)	## i = CLRJ | s1 = CLRJ | s2 = CLRJ
    while i != -1:	## i = CLRJ
        res.append(i+len(s2)-1)	## res = CLRJ | i = CLRJ | s2 = CLRJ
        i = s1.rfind(s2, 0, i)	## i = CLRJ | s1 = CLRJ | s2 = CLRJ
    return res	## res = CLRJ
