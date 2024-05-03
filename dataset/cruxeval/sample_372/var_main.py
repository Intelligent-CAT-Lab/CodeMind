def f(list_, num):
    temp = []	## {"temp" : ''}
    for i in list_:	## {"i" : '',"list_" : ''}
        i = num // 2 * ('%s,' % i)	## {"i" : '',"num" : ''}
        temp.append(i)	## {"temp" : '',"i" : ''}
    return temp	## {"temp" : ''}
