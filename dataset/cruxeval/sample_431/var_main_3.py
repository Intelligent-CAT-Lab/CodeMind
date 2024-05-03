def f(n, m):
    arr = list(range(1, n+1))	## <state>arr = CLRJ | n = CLRJ</state>
    for i in range(m):	## <state>i = CLRJ | m = CLRJ</state>
        arr.clear()	## <state>arr = CLRJ</state>
    return arr	## <state>arr = CLRJ</state>
