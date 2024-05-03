def f(string):
    if not string or not string[0].isnumeric:	## string = CLRJ
        return 'INVALID'
    cur = 0	## cur = CLRJ
    for i in range(len(string)):	## i = CLRJ | string = CLRJ
        cur = cur * 10 + int(string[i])	## cur = CLRJ | string = CLRJ | i = CLRJ
    return str(cur)	## cur = CLRJ
