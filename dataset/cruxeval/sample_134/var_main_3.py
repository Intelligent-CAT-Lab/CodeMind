def f(n):
    t = 0	## <state>t = CLRJ</state>
    b = ''	## <state>b = CLRJ</state>
    digits = list(map(int, str(n)))	## <state>digits = CLRJ | n = CLRJ</state>
    for d in digits:	## <state>d = CLRJ | digits = CLRJ</state>
        if d == 0: t += 1	## <state>d = CLRJ | t = CLRJ</state>
        else: break
    for _ in range(t):	## <state>t = CLRJ</state>
        b += str(1) + '0' + str(4)
    b += str(n)	## <state>b = CLRJ | n = CLRJ</state>
    return b	## <state>b = CLRJ</state>
