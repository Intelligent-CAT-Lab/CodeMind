def f(c, st, ed):
    d = {}	## <state>d = CLRJ</state>
    a, b = 0, 0	## <state>a = CLRJ | b = CLRJ</state>
    for x, y in c.items():	## <state>x = CLRJ | y = CLRJ | c = CLRJ</state>
        d[y] = x	## <state>d = CLRJ | y = CLRJ | x = CLRJ</state>
        if y == st:	## <state>y = CLRJ | st = CLRJ</state>
            a = x	## <state>a = CLRJ | x = CLRJ</state>
        if y == ed:	## <state>y = CLRJ | ed = CLRJ</state>
            b = x	## <state>b = CLRJ | x = CLRJ</state>
    w = d[st]	## <state>w = CLRJ | d = CLRJ | st = CLRJ</state>
    return (w, b) if a > b else (b, w)	## <state>a = CLRJ | b = CLRJ | w = CLRJ</state>
