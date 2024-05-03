def f(seq, v):
    a = []	## <state>a = CLRJ</state>
    for i in seq:	## <state>i = CLRJ | seq = CLRJ</state>
        if i.endswith(v):	## <state>i = CLRJ | v = CLRJ</state>
            a.append(i*2)	## <state>a = CLRJ | i = CLRJ</state>
    return a	## <state>a = CLRJ</state>
