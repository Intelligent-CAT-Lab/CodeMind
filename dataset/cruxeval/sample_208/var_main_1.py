def f(items):
    result = []	## result = CLRJ
    for item in items:	## item = CLRJ | items = CLRJ
        for d in item:	## d = CLRJ | item = CLRJ
            if not d.isdigit():	## d = CLRJ
                result.append(d)	## result = CLRJ | d = CLRJ
    return result	## result = CLRJ
