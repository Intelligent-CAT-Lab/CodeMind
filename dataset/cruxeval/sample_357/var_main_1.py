def f(s):
    r = []	## r = CLRJ
    for i in range(len(s) - 1, 0 - 1, -1):	## i = CLRJ | s = CLRJ
        r += s[i]	## r = CLRJ | s = CLRJ | i = CLRJ
    return ''.join(r)	## r = CLRJ
