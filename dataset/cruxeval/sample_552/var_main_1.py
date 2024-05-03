def f(d):
    result = {}	## result = CLRJ
    for k, v in d.items():	## k = CLRJ | v = CLRJ | d = CLRJ
        if isinstance(k, float):	## k = CLRJ
            for i in v:
                result[i] = k
        else:
            result[k] = v	## result = CLRJ | k = CLRJ | v = CLRJ
    return result	## result = CLRJ
