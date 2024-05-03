def f(text):
    ls = list(text)	## <state>ls = CLRJ | text = CLRJ</state>
    for x in range(len(ls)-1, -1, -1):	## <state>x = CLRJ | ls = CLRJ</state>
        if len(ls) <= 1: break	## <state>ls = CLRJ</state>
        if ls[x] not in 'zyxwvutsrqponmlkjihgfedcba': ls.pop(ls[x])	## <state>ls = CLRJ | x = CLRJ</state>
    return ''.join(ls)	## <state>ls = CLRJ</state>
