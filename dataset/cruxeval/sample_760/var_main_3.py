def f(d):
    l = []	## <state>l = CLRJ</state>
    while len(d) > 0:	## <state>d = CLRJ</state>
        key = d.popitem()[0]	## <state>key = CLRJ | d = CLRJ</state>
        l.append(key)	## <state>l = CLRJ | key = CLRJ</state>
    return l;	## <state>l = CLRJ</state>
