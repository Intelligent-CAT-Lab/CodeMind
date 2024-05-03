def f(text):
    ls = list(text)	## <state>ls = CLRJ | text = CLRJ</state>
    length = len(ls)	## <state>length = CLRJ | ls = CLRJ</state>
    for i in range(length):	## <state>i = CLRJ | length = CLRJ</state>
        ls.insert(i, ls[i])	## <state>ls = CLRJ | i = CLRJ</state>
    return ''.join(ls).ljust(length * 2)	## <state>ls = CLRJ | length = CLRJ</state>
