def f(str, n):
    if len(str) < n:	## {"str" : '',"n" : ''}
        return str	## {"str" : ''}
    else:
        return str.removeprefix(str[:n])