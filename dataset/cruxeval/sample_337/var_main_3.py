def f(txt):
    d = []	## <state>d = CLRJ</state>
    for c in txt:	## <state>c = CLRJ | txt = CLRJ</state>
        if c.isdigit():	## <state>c = CLRJ</state>
            continue
        if c.islower():	## <state>c = CLRJ</state>
            d.append(c.upper())	## <state>d = CLRJ | c = CLRJ</state>
        elif c.isupper():
            d.append(c.lower())
    return ''.join(d)	## <state>d = CLRJ</state>
