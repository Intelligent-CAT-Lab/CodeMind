def f(arr):
    count = len(arr)	## count = CLRJ | arr = CLRJ
    sub = arr.copy()	## sub = CLRJ | arr = CLRJ
    for i in range(0, count, 2):	## i = CLRJ | count = CLRJ
        sub[i] *= 5	## sub = CLRJ | i = CLRJ
    return sub	## sub = CLRJ
