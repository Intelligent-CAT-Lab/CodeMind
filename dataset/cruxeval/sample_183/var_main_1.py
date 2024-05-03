def f(text):
    ls = text.split()	## ls = CLRJ | text = CLRJ
    lines = " ".join(ls[::3]).splitlines()	## lines = CLRJ | ls = CLRJ
    res = []	## res = CLRJ
    for i in range(2):	## i = CLRJ
        ln = ls[1::3]	## ln = CLRJ | ls = CLRJ
        if 3 * i + 1 < len(ln):	## i = CLRJ | ln = CLRJ
            res.append(" ".join(ln[3 * i:3 * (i + 1)]))
    return lines + res	## lines = CLRJ | res = CLRJ
