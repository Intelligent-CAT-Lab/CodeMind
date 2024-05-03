def f(a, b):
    for key, value in b.items():	## key = CLRJ | value = CLRJ | b = CLRJ
        if key not in a:	## key = CLRJ | a = CLRJ
            a[key] = [value]	## a = CLRJ | key = CLRJ | value = CLRJ
        else:
            a[key].append(value)
    return a	## a = CLRJ
