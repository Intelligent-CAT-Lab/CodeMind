def f(n):
    t = 0	## {"t" : ''}
    b = ''	## {"b" : ''}
    digits = list(map(int, str(n)))	## {"digits" : '',"n" : ''}
    for d in digits:	## {"d" : '',"digits" : ''}
        if d == 0: t += 1	## {"d" : '',"t" : ''}
        else: break
    for _ in range(t):	## {"t" : ''}
        b += str(1) + '0' + str(4)
    b += str(n)	## {"b" : '',"n" : ''}
    return b	## {"b" : ''}
