def f(d, n):
    for i in range(n):	## <state>i = CLRJ | n = CLRJ</state>
        item = d.popitem()	## <state>item = CLRJ | d = CLRJ</state>
        d[item[1]] = item[0]	## <state>d = CLRJ | item = CLRJ</state>
    return d	## <state>d = CLRJ</state>
