def f(m):
    items = list(m.items())	## <state>items = CLRJ | m = CLRJ</state>
    for i in range(len(items)-2, -1, -1):	## <state>i = CLRJ | items = CLRJ</state>
        tmp = items[i]	## <state>tmp = CLRJ | items = CLRJ | i = CLRJ</state>
        items[i] = items[i+1] 	## <state>items = CLRJ | i = CLRJ</state>
        items[i+1] = tmp	## <state>items = CLRJ | i = CLRJ | tmp = CLRJ</state>
    return ['{}={}', '{1}={0}'][len(items) % 2].format(	## <state>items = CLRJ</state>
        *m.keys(), **m	## <state>m = CLRJ</state>
    )