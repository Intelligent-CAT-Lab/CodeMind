def f(dict):
    result = dict.copy()	## result = CLRJ | dict = CLRJ
    remove_keys = []	## remove_keys = CLRJ
    for k, v in dict.items():	## k = CLRJ | v = CLRJ | dict = CLRJ
        if v in dict:	## v = CLRJ | dict = CLRJ
            del result[k]	## result = CLRJ | k = CLRJ
    return result	## result = CLRJ
