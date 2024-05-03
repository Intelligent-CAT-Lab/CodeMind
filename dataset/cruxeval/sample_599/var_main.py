def f(a, b):
    a = b.join(a)	## {"a" : '',"b" : ''}
    lst = []	## {"lst" : ''}
    for i in range(1, len(a)+1, 2):	## {"i" : '',"a" : ''}
        lst.append(a[i-1:][:i])	## {"lst" : '',"a" : '',"i" : ''}
        lst.append(a[i-1:][i:])	## {"lst" : '',"a" : '',"i" : ''}
    return lst	## {"lst" : ''}
