def f(string):
    upper = 0	## {"upper" : ''}
    for c in string:	## {"c" : '',"string" : ''}
        if c.isupper():	## {"c" : ''}
            upper += 1	## {"upper" : ''}
    return upper * (2,1)[upper % 2]	## {"upper" : ''}
