def f(arr):
    n = [item for item in arr if item%2 == 0]	## <state>n = CLRJ | item = CLRJ | arr = CLRJ</state>
    m = n+arr	## <state>m = CLRJ | n = CLRJ | arr = CLRJ</state>
    for i in m:	## <state>i = CLRJ | m = CLRJ</state>
        if m.index(i) >= len(n):	## <state>m = CLRJ | i = CLRJ | n = CLRJ</state>
            m.remove(i)	## <state>m = CLRJ | i = CLRJ</state>
    return m	## <state>m = CLRJ</state>
