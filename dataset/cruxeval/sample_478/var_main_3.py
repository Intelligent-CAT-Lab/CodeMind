def f(sb):
    d = {}	## <state>d = CLRJ</state>
    for s in sb:	## <state>s = CLRJ | sb = CLRJ</state>
        d[s] = d.get(s, 0) + 1	## <state>d = CLRJ | s = CLRJ</state>
    return d	## <state>d = CLRJ</state>
