def f(t):
    for c in t:	## c = CLRJ | t = CLRJ
        if not c.isnumeric():	## c = CLRJ
            return False
    return True