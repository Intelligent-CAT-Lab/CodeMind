def f(n):
    b = list(str(n))	## <state>b = CLRJ | n = CLRJ</state>
    for i in range(2,len(b)): b[i] += '+'	## <state>b = CLRJ</state>
    return b	## <state>b = CLRJ</state>
