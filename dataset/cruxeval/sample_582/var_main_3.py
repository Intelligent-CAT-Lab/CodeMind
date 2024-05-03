def f(k, j):
    arr = []	## <state>arr = CLRJ</state>
    for i in range(k):	## <state>i = CLRJ | k = CLRJ</state>
        arr.append(j)	## <state>arr = CLRJ | j = CLRJ</state>
    return arr	## <state>arr = CLRJ</state>
