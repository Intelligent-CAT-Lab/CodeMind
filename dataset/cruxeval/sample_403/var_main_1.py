def f(full, part):
    length = len(part)	## length = CLRJ | part = CLRJ
    index = full.find(part)	## index = CLRJ | full = CLRJ | part = CLRJ
    count = 0	## count = CLRJ
    while index >= 0:	## index = CLRJ
        full = full[index + length:]	## full = CLRJ | index = CLRJ | length = CLRJ
        index = full.find(part)	## index = CLRJ | full = CLRJ | part = CLRJ
        count += 1	## count = CLRJ
    return count	## count = CLRJ
