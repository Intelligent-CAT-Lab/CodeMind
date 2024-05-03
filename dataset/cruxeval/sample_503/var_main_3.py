def f(d):
    result = [None] * len(d)	## <state>result = CLRJ | d = CLRJ</state>
    a = b = 0	## <state>a = CLRJ | b = CLRJ</state>
    while d:	## <state>d = CLRJ</state>
        result[a] = d.popitem(a == b)
        a, b = b, (b+1) % len(result)
    return result	## <state>result = CLRJ</state>
