def f(n):
    for i in str(n):	## <state>i = CLRJ | n = CLRJ</state>
        if not i.isdigit():	## <state>i = CLRJ</state>
            n = -1	## <state>n = CLRJ</state>
            break
    return n	## <state>n = CLRJ</state>
