def f(a):
    b = a.copy()	## <state>b = CLRJ | a = CLRJ</state>
    for k in range(0, len(a) - 1, 2):	## <state>k = CLRJ | a = CLRJ</state>
        b.insert(k + 1, b[k])	## <state>b = CLRJ | k = CLRJ</state>
    b.append(b[0])	## <state>b = CLRJ</state>
    return b	## <state>b = CLRJ</state>
