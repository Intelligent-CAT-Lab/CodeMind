def f(w):
    ls = list(w)	## <state>ls = CLRJ | w = CLRJ</state>
    omw = ''	## <state>omw = CLRJ</state>
    while len(ls) > 0:	## <state>ls = CLRJ</state>
        omw += ls.pop(0)	## <state>omw = CLRJ | ls = CLRJ</state>
        if len(ls) * 2 > len(w):	## <state>ls = CLRJ | w = CLRJ</state>
            return w[len(ls):] == omw	## <state>w = CLRJ | ls = CLRJ | omw = CLRJ</state>
    return False