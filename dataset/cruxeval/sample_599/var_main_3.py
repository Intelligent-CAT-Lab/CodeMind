def f(a, b):
    a = b.join(a)	## <state>a = CLRJ | b = CLRJ</state>
    lst = []	## <state>lst = CLRJ</state>
    for i in range(1, len(a)+1, 2):	## <state>i = CLRJ | a = CLRJ</state>
        lst.append(a[i-1:][:i])	## <state>lst = CLRJ | a = CLRJ | i = CLRJ</state>
        lst.append(a[i-1:][i:])	## <state>lst = CLRJ | a = CLRJ | i = CLRJ</state>
    return lst	## <state>lst = CLRJ</state>
