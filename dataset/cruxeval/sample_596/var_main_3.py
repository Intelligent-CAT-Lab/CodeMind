def f(txt, alpha):
    txt = sorted(txt)	## <state>txt = CLRJ</state>
    if txt.index(alpha) % 2 == 0:	## <state>txt = CLRJ | alpha = CLRJ</state>
        return txt[::-1]
    return txt	## <state>txt = CLRJ</state>
