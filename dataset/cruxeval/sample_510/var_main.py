def f(a, b, c, d, e):
    key = d	## {"key" : '',"d" : ''}
    if key in a:	## {"key" : '',"a" : ''}
        num = a.pop(key)
    if b > 3:	## {"b" : ''}
        return ''.join(c)	## {"c" : ''}
    else:
        return num