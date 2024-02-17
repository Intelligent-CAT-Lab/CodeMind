def f(n):
    p = ''
    if n%2 == 1:
        p+='sn'
    else:
        return n*n
    for x in range(1, n+1):
        if x%2 == 0:
            p+='to'
        else:
            p+='ts'
    return p