def f(n):
    p = ''	## <state>p = CLRJ</state>
    if n%2 == 1:	## <state>n = CLRJ</state>
        p+='sn'	## <state>p = CLRJ</state>
    else:
        return n*n
    for x in range(1, n+1):	## <state>x = CLRJ | n = CLRJ</state>
        if x%2 == 0:	## <state>x = CLRJ</state>
            p+='to'
        else:
            p+='ts'	## <state>p = CLRJ</state>
    return p	## <state>p = CLRJ</state>
