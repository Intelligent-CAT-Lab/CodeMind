def f(n):
    p = ''	## p = CLRJ
    if n%2 == 1:	## n = CLRJ
        p+='sn'	## p = CLRJ
    else:
        return n*n
    for x in range(1, n+1):	## x = CLRJ | n = CLRJ
        if x%2 == 0:	## x = CLRJ
            p+='to'
        else:
            p+='ts'	## p = CLRJ
    return p	## p = CLRJ
