def f(string):
    upper = 0	## upper = CLRJ
    for c in string:	## c = CLRJ | string = CLRJ
        if c.isupper():	## c = CLRJ
            upper += 1	## upper = CLRJ
    return upper * (2,1)[upper % 2]	## upper = CLRJ
