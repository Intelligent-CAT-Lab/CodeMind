def f(n):
    values = {0: 3, 1: 4.5, 2: '-'}	## {"values" : ''}
    res = {}	## {"res" : ''}
    for i, j in values.items():	## {"i" : '',"j" : '',"values" : ''}
        if i % n != 2:	## {"i" : '',"n" : ''}
            res[j] = n // 2	## {"res" : '',"j" : '',"n" : ''}
    return sorted(res)	## {"res" : ''}
