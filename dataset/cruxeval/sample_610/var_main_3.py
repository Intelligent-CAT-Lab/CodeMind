def f(keys, value):
    d = dict.fromkeys(keys, value)	## <state>d = CLRJ | keys = CLRJ | value = CLRJ</state>
    for i, k in enumerate(d.copy(), 1):	## <state>i = CLRJ | k = CLRJ | d = CLRJ</state>
        if d[k] == d[i]:	## <state>d = CLRJ | k = CLRJ | i = CLRJ</state>
            del d[i]	## <state>d = CLRJ | i = CLRJ</state>
    return d	## <state>d = CLRJ</state>
