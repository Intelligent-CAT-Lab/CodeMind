def f(text):
    created = []	## created = CLRJ
    for line in text.splitlines():	## line = CLRJ | text = CLRJ
        if line == '':	## line = CLRJ
            break
        created.append(list(list(line.rstrip())[::-1][flush]))	## created = CLRJ | line = CLRJ
    return created[::-1]	## created = CLRJ

flush = 0