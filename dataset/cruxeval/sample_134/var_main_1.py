def f(n):
    t = 0	## t = CLRJ
    b = ''	## b = CLRJ
    digits = list(map(int, str(n)))	## digits = CLRJ | n = CLRJ
    for d in digits:	## d = CLRJ | digits = CLRJ
        if d == 0: t += 1	## d = CLRJ | t = CLRJ
        else: break
    for _ in range(t):	## t = CLRJ
        b += str(1) + '0' + str(4)
    b += str(n)	## b = CLRJ | n = CLRJ
    return b	## b = CLRJ
