def f(obj):
    for k, v in obj.items():	## k = CLRJ | v = CLRJ | obj = CLRJ
        if v >= 0:	## v = CLRJ
            obj[k] = -v	## obj = CLRJ | k = CLRJ | v = CLRJ
    return obj	## obj = CLRJ
