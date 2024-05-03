def f(txt):
    d = []	## d = []
    for c in txt:	## c = [] | txt = []
        if c.isdigit():	## c = []
            continue
        if c.islower():	## c = []
            d.append(c.upper())	## d = [] | c = []
        elif c.isupper():
            d.append(c.lower())
    return ''.join(d)	## d = []
