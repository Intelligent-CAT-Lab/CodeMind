def f(n):
    p = ''	## {"p" : ''}
    if n%2 == 1:	## {"n" : ''}
        p+='sn'	## {"p" : ''}
    else:
        return n*n
    for x in range(1, n+1):	## {"x" : '',"n" : ''}
        if x%2 == 0:	## {"x" : ''}
            p+='to'
        else:
            p+='ts'	## {"p" : ''}
    return p	## {"p" : ''}
