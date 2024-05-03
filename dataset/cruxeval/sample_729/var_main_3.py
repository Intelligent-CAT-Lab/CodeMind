def f(s1,s2):
    res = []	## <state>res = CLRJ</state>
    i = s1.rfind(s2)	## <state>i = CLRJ | s1 = CLRJ | s2 = CLRJ</state>
    while i != -1:	## <state>i = CLRJ</state>
        res.append(i+len(s2)-1)	## <state>res = CLRJ | i = CLRJ | s2 = CLRJ</state>
        i = s1.rfind(s2, 0, i)	## <state>i = CLRJ | s1 = CLRJ | s2 = CLRJ</state>
    return res	## <state>res = CLRJ</state>
