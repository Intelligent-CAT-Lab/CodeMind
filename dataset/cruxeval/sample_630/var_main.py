def f(original, string):
    temp = dict(original)	## {"temp" : '',"original" : ''}
    for a, b in string.items():	## {"a" : '',"b" : '',"string" : ''}
        temp[b] = a	## {"temp" : '',"b" : '',"a" : ''}
    return temp	## {"temp" : ''}
