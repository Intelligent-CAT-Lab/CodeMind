def f(bag):
    values = list(bag.values())	## <state>values = CLRJ | bag = CLRJ</state>
    tbl = {}	## <state>tbl = CLRJ</state>
    for v in range(100):	## <state>v = CLRJ</state>
        if v in values:	## <state>v = CLRJ | values = CLRJ</state>
            tbl[v] = values.count(v)	## <state>tbl = CLRJ | v = CLRJ | values = CLRJ</state>
    return tbl	## <state>tbl = CLRJ</state>
