def f(original, string):
    temp = dict(original)	## temp = CLRJ | original = CLRJ
    for a, b in string.items():	## a = CLRJ | b = CLRJ | string = CLRJ
        temp[b] = a	## temp = CLRJ | b = CLRJ | a = CLRJ
    return temp	## temp = CLRJ
