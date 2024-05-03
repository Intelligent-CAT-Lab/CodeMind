def x_or_y(n, x, y):
    if n == 1:	## n = CLRJ
        return y
    for i in range(2, n):	## i = CLRJ|n = CLRJ
        if n % i == 0:	## n = CLRJ|i = CLRJ
            return y
            break
    else:
        return x	## x = CLRJ
