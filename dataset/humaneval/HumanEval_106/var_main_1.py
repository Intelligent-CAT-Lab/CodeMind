def f(n):
    ret = []	## ret = CLRJ
    for i in range(1,n+1):	## i = CLRJ|n = CLRJ
        if i%2 == 0:	## i = CLRJ
            x = 1	## x = CLRJ
            for j in range(1,i+1): x *= j	## j = CLRJ|i = CLRJ|x = CLRJ
            ret += [x]	## ret = CLRJ|x = CLRJ
        else:
            x = 0	## x = CLRJ
            for j in range(1,i+1): x += j	## j = CLRJ|i = CLRJ|x = CLRJ
            ret += [x]	## ret = CLRJ|x = CLRJ
    return ret	## ret = CLRJ
