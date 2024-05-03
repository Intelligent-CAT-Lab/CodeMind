def f(d, count):
    for i in range(count):	## <state>i = CLRJ | count = CLRJ</state>
        if d == {}:	## <state>d = CLRJ</state>
            break
        d.popitem()
    return d	## <state>d = CLRJ</state>
