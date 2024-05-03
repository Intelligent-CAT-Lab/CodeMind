def f(a, b):
    d = dict(zip(a, b))	## <state>d = CLRJ | a = CLRJ | b = CLRJ</state>
    a.sort(key=d.get, reverse=True)	## <state>a = CLRJ | d = CLRJ</state>
    return [d.pop(x) for x in a]	## <state>d = CLRJ | x = CLRJ | a = CLRJ</state>
