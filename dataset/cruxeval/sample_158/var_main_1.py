def f(arr):
    n = [item for item in arr if item%2 == 0]	## n = CLRJ | item = CLRJ | arr = CLRJ
    m = n+arr	## m = CLRJ | n = CLRJ | arr = CLRJ
    for i in m:	## i = CLRJ | m = CLRJ
        if m.index(i) >= len(n):	## m = CLRJ | i = CLRJ | n = CLRJ
            m.remove(i)	## m = CLRJ | i = CLRJ
    return m	## m = CLRJ
