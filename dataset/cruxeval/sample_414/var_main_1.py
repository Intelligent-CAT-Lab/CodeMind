def f(d):
    dCopy = d.copy()	## dCopy = CLRJ | d = CLRJ
    for key, value in dCopy.items():	## key = CLRJ | value = CLRJ | dCopy = CLRJ
        for i in range(len(value)):	## i = CLRJ | value = CLRJ
            value[i] = value[i].upper()	## value = CLRJ | i = CLRJ
    return dCopy	## dCopy = CLRJ
