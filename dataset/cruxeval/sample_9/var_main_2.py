def f(t):
    for c in t:	## c = [] | t = []
        if not c.isnumeric():	## c = []
            return False
    return True