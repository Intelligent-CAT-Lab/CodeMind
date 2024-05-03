def f(s):
    r = []	## <state>r = CLRJ</state>
    for i in range(len(s) - 1, 0 - 1, -1):	## <state>i = CLRJ | s = CLRJ</state>
        r += s[i]	## <state>r = CLRJ | s = CLRJ | i = CLRJ</state>
    return ''.join(r)	## <state>r = CLRJ</state>
