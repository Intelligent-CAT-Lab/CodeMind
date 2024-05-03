def f(arr):
    count = len(arr)	## <state>count = CLRJ | arr = CLRJ</state>
    sub = arr.copy()	## <state>sub = CLRJ | arr = CLRJ</state>
    for i in range(0, count, 2):	## <state>i = CLRJ | count = CLRJ</state>
        sub[i] *= 5	## <state>sub = CLRJ | i = CLRJ</state>
    return sub	## <state>sub = CLRJ</state>
