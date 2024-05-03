def f(text):
    ls = list(text)	## <state>ls = CLRJ | text = CLRJ</state>
    for i in range(0, len(ls)):	## <state>i = CLRJ | ls = CLRJ</state>
        if ls[i]!='+':	## <state>ls = CLRJ | i = CLRJ</state>
            ls.insert(i, '+')	## <state>ls = CLRJ | i = CLRJ</state>
            ls.insert(i, '*')	## <state>ls = CLRJ | i = CLRJ</state>
            break
    return '+'.join(ls)	## <state>ls = CLRJ</state>
