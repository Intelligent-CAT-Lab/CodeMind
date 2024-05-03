def f(string):
    if not string or not string[0].isnumeric:	## <state>string = CLRJ</state>
        return 'INVALID'
    cur = 0	## <state>cur = CLRJ</state>
    for i in range(len(string)):	## <state>i = CLRJ | string = CLRJ</state>
        cur = cur * 10 + int(string[i])	## <state>cur = CLRJ | string = CLRJ | i = CLRJ</state>
    return str(cur)	## <state>cur = CLRJ</state>
