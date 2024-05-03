def f(arr, d):
    for i in range(1, len(arr), 2):	## i = CLRJ | arr = CLRJ
        d.update({arr[i]: arr[i-1]})	## d = CLRJ | arr = CLRJ | i = CLRJ

    return d	## d = CLRJ
