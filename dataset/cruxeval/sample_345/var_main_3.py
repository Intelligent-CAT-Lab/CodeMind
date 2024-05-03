def f(a, b):
    if a < b:	## <state>a = CLRJ | b = CLRJ</state>
        return (b, a)	## <state>b = CLRJ | a = CLRJ</state>
    return (a, b)