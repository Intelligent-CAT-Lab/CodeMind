def f(txt):
    d = []	## d = CLRJ
    for c in txt:	## c = CLRJ | txt = CLRJ
        if c.isdigit():	## c = CLRJ
            continue
        if c.islower():	## c = CLRJ
            d.append(c.upper())	## d = CLRJ | c = CLRJ
        elif c.isupper():
            d.append(c.lower())
    return ''.join(d)	## d = CLRJ
