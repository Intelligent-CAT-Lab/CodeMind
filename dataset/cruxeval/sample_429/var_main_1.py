def f(d):
    result = []	## result = CLRJ
    while len(d.keys()) > 0:	## d = CLRJ
        result.append(d.popitem())	## result = CLRJ | d = CLRJ
    return result	## result = CLRJ
