def f(a):
    for _ in range(10):	## <state>_ = CLRJ</state>
        for j in range(len(a)):	## <state>j = CLRJ | a = CLRJ</state>
            if a[j] != '#':	## <state>a = CLRJ | j = CLRJ</state>
                a = a[j:]	## <state>a = CLRJ | j = CLRJ</state>
                break
        else:
            a = ""
            break
    while a[-1] == '#':	## <state>a = CLRJ</state>
        a = a[:-1]	## <state>a = CLRJ</state>
    return a	## <state>a = CLRJ</state>
