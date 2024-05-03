def f(d):
    size = len(d)	## <state>size = CLRJ | d = CLRJ</state>
    v = [0] * size	## <state>v = CLRJ | size = CLRJ</state>
    if size == 0:	## <state>size = CLRJ</state>
        return v
    for i, e in enumerate(d.values()):	## <state>i = CLRJ | e = CLRJ | d = CLRJ</state>
        v[i] = e	## <state>v = CLRJ | i = CLRJ | e = CLRJ</state>
    return v	## <state>v = CLRJ</state>
