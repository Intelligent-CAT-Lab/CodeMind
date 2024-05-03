def f(d):
    r = {}	## <state>r = CLRJ</state>
    while len(d) > 0:	## <state>d = CLRJ</state>
        r = {**r, **d}	## <state>r = CLRJ | d = CLRJ</state>
        del d[max(d.keys())]	## <state>d = CLRJ</state>
    return r	## <state>r = CLRJ</state>
