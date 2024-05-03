def f(t):
    for c in t:	## <state>c = CLRJ | t = CLRJ</state>
        if not c.isnumeric():	## <state>c = CLRJ</state>
            return False
    return True