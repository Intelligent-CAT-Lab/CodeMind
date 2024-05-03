def f(text):
    ls = text.split()	## <state>ls = CLRJ | text = CLRJ</state>
    lines = " ".join(ls[::3]).splitlines()	## <state>lines = CLRJ | ls = CLRJ</state>
    res = []	## <state>res = CLRJ</state>
    for i in range(2):	## <state>i = CLRJ</state>
        ln = ls[1::3]	## <state>ln = CLRJ | ls = CLRJ</state>
        if 3 * i + 1 < len(ln):	## <state>i = CLRJ | ln = CLRJ</state>
            res.append(" ".join(ln[3 * i:3 * (i + 1)]))
    return lines + res	## <state>lines = CLRJ | res = CLRJ</state>
