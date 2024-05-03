def f(a, b, c, d, e):
    key = d	## <state>key = CLRJ | d = CLRJ</state>
    if key in a:	## <state>key = CLRJ | a = CLRJ</state>
        num = a.pop(key)
    if b > 3:	## <state>b = CLRJ</state>
        return ''.join(c)	## <state>c = CLRJ</state>
    else:
        return num