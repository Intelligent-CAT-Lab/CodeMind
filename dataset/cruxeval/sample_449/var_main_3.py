def f(x):
    n = len(x)	## <state>n = CLRJ | x = CLRJ</state>
    i = 0	## <state>i = CLRJ</state>
    while i < n and x[i].isdigit():	## <state>i = CLRJ | n = CLRJ | x = CLRJ</state>
        i += 1	## <state>i = CLRJ</state>
    return i == n	## <state>i = CLRJ | n = CLRJ</state>
