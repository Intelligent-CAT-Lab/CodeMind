def f(x):
    a = 0	## <state>a = CLRJ</state>
    for i in x.split(' '):	## <state>i = CLRJ | x = CLRJ</state>
        a += len(i.zfill(len(i)*2))	## <state>a = CLRJ | i = CLRJ</state>
    return a	## <state>a = CLRJ</state>
