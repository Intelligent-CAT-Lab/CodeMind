def f(pattern, items):
    result = []	## result = CLRJ
    for text in items:	## text = CLRJ | items = CLRJ
        pos = text.rfind(pattern)	## pos = CLRJ | text = CLRJ | pattern = CLRJ
        if pos >= 0:	## pos = CLRJ
            result.append(pos)

    return result	## result = CLRJ
