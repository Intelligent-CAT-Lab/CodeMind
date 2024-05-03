def f(a):
    b = a.copy()	## {"b" : '',"a" : ''}
    for k in range(0, len(a) - 1, 2):	## {"k" : '',"a" : ''}
        b.insert(k + 1, b[k])	## {"b" : '',"k" : ''}
    b.append(b[0])	## {"b" : ''}
    return b	## {"b" : ''}
