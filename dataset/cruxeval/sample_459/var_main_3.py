def f(arr, d):
    for i in range(1, len(arr), 2):	## <state>i = CLRJ | arr = CLRJ</state>
        d.update({arr[i]: arr[i-1]})	## <state>d = CLRJ | arr = CLRJ | i = CLRJ</state>

    return d	## <state>d = CLRJ</state>
