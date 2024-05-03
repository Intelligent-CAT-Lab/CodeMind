def f(d):
    i = len(d) - 1	## <state>i = CLRJ | d = CLRJ</state>
    key = list(d.keys())[i]	## <state>key = CLRJ | d = CLRJ | i = CLRJ</state>
    d.pop(key, None)	## <state>d = CLRJ | key = CLRJ</state>
    return key, d	## <state>key = CLRJ | d = CLRJ</state>
