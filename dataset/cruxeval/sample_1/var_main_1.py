def f(a, b, c):
    result = {}	## result = CLRJ
    for d in a, b, c:	## d = CLRJ | a = CLRJ | b = CLRJ | c = CLRJ
        result.update(dict.fromkeys(d))	## result = CLRJ | d = CLRJ
    return result	## result = CLRJ
