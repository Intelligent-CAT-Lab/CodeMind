def f(m):
    items = list(m.items())	## items = CLRJ | m = CLRJ
    for i in range(len(items)-2, -1, -1):	## i = CLRJ | items = CLRJ
        tmp = items[i]	## tmp = CLRJ | items = CLRJ | i = CLRJ
        items[i] = items[i+1] 	## items = CLRJ | i = CLRJ
        items[i+1] = tmp	## items = CLRJ | i = CLRJ | tmp = CLRJ
    return ['{}={}', '{1}={0}'][len(items) % 2].format(	## items = CLRJ
        *m.keys(), **m	## m = CLRJ
    )